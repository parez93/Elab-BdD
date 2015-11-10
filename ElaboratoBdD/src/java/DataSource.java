
import java.io.Serializable;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class DataSource implements Serializable {

    // === Properties ============================================================
    // dati di identificazione dell'utente (da personalizzare)
    private String user = "userlab07";
    private String passwd = "setteDF";
    // URL per la connessione alla base di dati e' formato dai seguenti
    // componenti: <protocollo>://<host del server>/<nome base di dati>.
    private String url = "jdbc:postgresql://dbserver.scienze.univr.it/dblab07";
    // Driver da utilizzare per la connessione e l'esecuzione delle query.
    private String driver = "org.postgresql.Driver";
    // -- definizione delle query ------------------------------------------------

    /*Elenco dei corsi di laurea che stanno ospitando studenti Erasmus: per ogni corso indicare
     il nome,la facoltà, il tipo e il numero di studenti
     */
    private String query1 = "select distinct cl.nomeCl, cl.tipo,f.nomeF, count(s.mat)"
            + " from corso_laurea cl, facolta f, studente s, proposta p"
            + " where s.corso_laureaS= cl.nomeCl and p.facolta=f.nomeF and p.corso_laureaP=cl.nomeCl"
            + " group by cl.nomeCl, f.nomeF, s.corso_laureaS"
            + " order by cl.nomeCl";
    private String insertTest = "INSERT INTO  messaggio (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES (?, ?, ?, ?, ?)";
    private String query2 = "select distinct * from studente";
    private String query3 = "select mat, cog, nome, uni, stato  from studente";
    private String query5 = "select * from studente s where s.login = ?";
    private String query6 = "select cl.nomecl, cl.durata, s.nome, s.cog, s.da , s.dr from corso_laurea cl , studente s where s.corso_laureas= cl.nomecl AND s.mat= ?";
    private String query7 = "SELECT * FROM INSEGNAMENTO I , SEGUITO S, STUDENTE ST WHERE I.COD = S.INS_COD AND ST.MAT= S.STUDENTES AND ST.MAT=? ORDER BY I.COD ";
    //                              =>  ST.NOME , ST.COG , I.COD , I.NOMEI
    private String query8 = " select m.id, m.dataoram, m.oggetto ,s.nome , s.cog, s.mat from messaggio m , studente s where m.studentem = s.mat order by dataoram desc";
    private String query9 = " select * from messaggio where id = ?";
    // === Methods ===============================================================

    /**
     * Costruttore della classe. Carica i driver da utilizzare per la
     * connessione alla base di dati.
     *
     * @throws ClassNotFoundException Eccezione generata nel caso in cui i
     * driver per la connessione non siano trovati nel CLASSPATH.
     */
    public DataSource() throws ClassNotFoundException {
        Class.forName(driver);
    }

    private Query1Bean makeCorsoLaurea(ResultSet rs) throws SQLException {
        Query1Bean corsoLaurea = new Query1Bean();
        corsoLaurea.setNomeCl(rs.getString(1));
        corsoLaurea.setTipoCl(rs.getString(2));
        corsoLaurea.setFacolta(rs.getString(3));
        corsoLaurea.setnStudenti(Integer.parseInt(rs.getString(4)));
        return corsoLaurea;
    }

    private Query2Bean makeQuery2Bean(ResultSet rs) throws SQLException {
        Query2Bean query2Bean = new Query2Bean();
        query2Bean.setMat(rs.getString("mat"));
        query2Bean.setCog(rs.getString("cog"));
        query2Bean.setNome(rs.getString("nome"));
        query2Bean.setUni(rs.getString("uni"));
        query2Bean.setStato(rs.getString("stato"));
        query2Bean.setDn(rs.getString("dn"));
        query2Bean.setLogin(rs.getString("login"));
        query2Bean.setPw(rs.getString("pw"));
        query2Bean.setCorso_laureaS(rs.getString("corso_laureas"));
        query2Bean.setDa(rs.getString("da"));
        if (rs.getString("dr") == null) {
            query2Bean.setDr("NULL");
        } else {
            query2Bean.setDr(rs.getString("dr"));
        }

        return query2Bean;
    }

    private Query3Bean makeStudente(ResultSet rs) throws SQLException {
        Query3Bean studente = new Query3Bean();
        studente.setMat(rs.getString(1));
        studente.setCognome(rs.getString(2));
        studente.setNome(rs.getString(3));
        studente.setUniProv(rs.getString(4));
        studente.setSTP(rs.getString(5));
        return studente;
    }

    private Query6Bean makeQuery6Bean(ResultSet rs) throws SQLException {
        Query6Bean corsoOspitante = new Query6Bean();
        corsoOspitante.setNomeCL(rs.getString("nomecl"));
        corsoOspitante.setDurata(rs.getString("durata"));
        corsoOspitante.setDaS(rs.getString("da"));
        if (rs.getString("dr") == null) {
            corsoOspitante.setDrS("non ancora assegnata");
        } else {
            corsoOspitante.setDrS(rs.getString("dr"));
        }



        return corsoOspitante;
    }

    private Query7Bean makeInsegnamentiSeguiti(ResultSet rs) throws SQLException {
        Query7Bean insegnamentoSeguito = new Query7Bean();

        insegnamentoSeguito.setNome(rs.getString("nome"));
        insegnamentoSeguito.setCog(rs.getString("cog"));
        insegnamentoSeguito.setCod(rs.getString("cod"));
        insegnamentoSeguito.setNomei(rs.getString("nomei"));




        return insegnamentoSeguito;


    }

    private Query8Bean makeMessagioBreve(ResultSet rs) throws SQLException {
        Query8Bean messaggioBreve = new Query8Bean();

        messaggioBreve.setNomeS(rs.getString("nome"));
        messaggioBreve.setCogS(rs.getString("cog"));
        messaggioBreve.setDataoram(rs.getString("dataoram"));
        messaggioBreve.setOggetto(rs.getString("oggetto"));
        messaggioBreve.setIdM(rs.getInt("id"));



        return messaggioBreve;


    }

    private Query8Bean makeQuery9Bean(ResultSet rs) throws SQLException {
        Query8Bean messaggio = new Query8Bean();

        messaggio.setDataoram(rs.getString("dataoram"));
        messaggio.setOggetto(rs.getString("oggetto"));
        messaggio.setTestom(rs.getString("testom"));
        messaggio.setTipologia(rs.getString("tipologia"));



        return messaggio;


    }

    // ===========================================================================
    /**
     * Metodo per il recupero delle principali informazioni di tutte le persone
     *
     * @return
     */
    public List<Query1Bean> getQuery1() {
        // dichiarazione delle variabili
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Query1Bean> result = new ArrayList<Query1Bean>();

        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            stmt = con.createStatement();
            // eseguo l'interrogazione desiderata
            rs = stmt.executeQuery(query1);
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeCorsoLaurea(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }

    public List<Query2Bean> getQuery2() {
        // dichiarazione delle variabili
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Query2Bean> result = new ArrayList<Query2Bean>();

        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            stmt = con.createStatement();
            // eseguo l'interrogazione desiderata
            rs = stmt.executeQuery(query2);
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeQuery2Bean(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }

    public List<Query3Bean> getQuery3() {
        // dichiarazione delle variabili
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Query3Bean> result = new ArrayList<Query3Bean>();

        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            stmt = con.createStatement();
            // eseguo l'interrogazione desiderata
            rs = stmt.executeQuery(query3);
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeStudente(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }

    public List<Query2Bean> getQuery5(String login) {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Query2Bean> result = new ArrayList<Query2Bean>();// il bean2 e identico a cio che serve nel bean 5 quindi richiamo direttamente il bean 2 senza utilizzare altre strutture


        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            //    stmt = con.createStatement();
            pstmt = con.prepareStatement(query5);
            pstmt.clearParameters();
            pstmt.setString(1, login);
            // eseguo l'interrogazione desiderata

            // query5+="'"+login+"'";//modifico la query5 aggiungendo la nuova parte

            //rs = stmt.executeQuery(query5);
            rs = pstmt.executeQuery();
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeQuery2Bean(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }

    public List<Query6Bean> getQuery6(String mat) {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Query6Bean> result = new ArrayList<Query6Bean>();// il bean2 e identico a cio che serve nel bean 5 quindi richiamo direttamente il bean 2 senza utilizzare altre strutture


        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            //    stmt = con.createStatement();
            pstmt = con.prepareStatement(query6);
            pstmt.clearParameters();
            pstmt.setString(1, mat);
            // eseguo l'interrogazione desiderata

            // query5+="'"+login+"'";//modifico la query5 aggiungendo la nuova parte

            //rs = stmt.executeQuery(query5);
            rs = pstmt.executeQuery();
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeQuery6Bean(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }

    public List<Query7Bean> getQuery7(String mat) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        List<Query7Bean> result = new ArrayList<Query7Bean>();

        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            pstmt = con.prepareStatement(query7);
            pstmt.clearParameters();
            pstmt.setString(1, mat);
            // eseguo l'interrogazione desiderata
            rs = pstmt.executeQuery();
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeInsegnamentiSeguiti(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }

    public List<Query8Bean> getQuery8() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Query8Bean> result = new ArrayList<Query8Bean>();

        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            stmt = con.createStatement();
            // eseguo l'interrogazione desiderata
            rs = stmt.executeQuery(query8);
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeMessagioBreve(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }

    public void insert(InsertBean messaggio) {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            //    stmt = con.createStatement();
            pstmt = con.prepareStatement(insertTest);
            pstmt.clearParameters();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // creo un tipo di stringa per data e ora del tipo timeshringi
            java.util.Date date = new java.util.Date();
            messaggio.setDataOra(dateFormat.format(date));
            Timestamp timedate= Timestamp.valueOf(messaggio.getDataOra());
            //(STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA)
            pstmt.setString(1, messaggio.getMatricola());
            pstmt.setTimestamp(2, timedate);
            pstmt.setString(3, messaggio.getOggetto());
            pstmt.setString(4, messaggio.getTesto());
            pstmt.setString(5, messaggio.getTipologia());
            // eseguo l'interrogazione desiderata

            rs = pstmt.executeQuery();
            // memorizzo il risultato dell'interrogazione nel Vector


        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
    }

    public List<Query8Bean> getQuery9(String idM) {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Query8Bean> result = new ArrayList<Query8Bean>();// il bean8 e identico a cio che serve nel bean 9 quindi richiamo direttamente il bean 8 senza utilizzare altre strutture


        try {
            // tentativo di connessione al database
            con = DriverManager.getConnection(url, user, passwd);
            // connessione riuscita, ottengo l'oggetto per l'esecuzione dell'interrogazione.
            //    stmt = con.createStatement();
            pstmt = con.prepareStatement(query9);
            pstmt.clearParameters();
            pstmt.setInt(1, Integer.parseInt(idM));
            // eseguo l'interrogazione desiderata


            rs = pstmt.executeQuery();
            // memorizzo il risultato dell'interrogazione nel Vector
            while (rs.next()) {
                result.add(makeQuery9Bean(rs));
            }

        } catch (SQLException sqle) { // catturo le eventuali eccezioni!
            sqle.printStackTrace();

        } finally { // alla fine chiudo la connessione.
            try {
                con.close();
            } catch (SQLException sqle1) {
                sqle1.printStackTrace();
            }
        }
        return result;
    }
}
