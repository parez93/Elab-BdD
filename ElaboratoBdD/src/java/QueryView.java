
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "qv")
@SessionScoped
@RequestScoped
public class QueryView implements Serializable {

    private List<Query1Bean> resStringQuery1;
    private List<Query2Bean> query2BeanList;
    private List<Query3Bean> resStringQuery3;
    private List<Query7Bean> resStringQuery7;
    private List<Query8Bean> resStringQuery8;
    private DataSource dataSource;
    private InsertBean insert;

    public InsertBean getInsert() {
        return insert;
    }

    public void setInsert(InsertBean insert) {
        this.insert = insert;
        this.insert.submit();
    }
    private String val;// a progetto finito eliminare

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @PostConstruct
    public void initialize() {
        try {
            this.dataSource = new DataSource();
        } catch (ClassNotFoundException e) {
            this.dataSource = null;
        }
    }

    public List<Query1Bean> getResStringQuery1() {
        if (this.dataSource != null) {
            resStringQuery1 = dataSource.getQuery1();
        }
        return resStringQuery1;
    }

    public List<Query2Bean> getQuery2BeanList() {
        if (this.dataSource != null) {

            query2BeanList = dataSource.getQuery2();
        }
        return query2BeanList;
    }

    public List<Query3Bean> getResStringQuery3() {
        if (this.dataSource != null) {

            resStringQuery3 = dataSource.getQuery3();
        }
        return resStringQuery3;
    }

    public List<Query7Bean> getResStringQuery7(String mat) {
        if (this.dataSource != null) {
            resStringQuery7 = dataSource.getQuery7(mat);
        }
        return resStringQuery7;
    }

    public List<Query8Bean> getResStringQuery8() {
        if (this.dataSource != null) {
            resStringQuery8 = dataSource.getQuery8();
        }
        return resStringQuery8;
    }

    public void submitQuery() {
        if (this.dataSource != null) {
            this.dataSource.insert(this.insert);
        }
    }



    public void submit(String mat, InsertBean is) {
        // handle form submission
        this.insert = is;// copio i dati del bean 
        this.insert.setMatricola(mat);//setto la matricola per le referenze relazionali
        this.insert.submit();// chiama la funzio di configurazione del output  per verifia dei dati inseriti
        this.submitQuery();// chiamo la funzione di inserimento della query

    }
}
