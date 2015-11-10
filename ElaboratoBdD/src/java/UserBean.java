



import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class UserBean implements Serializable {

    private String loginUB;
    private String passwordUB;
    private String status;
    private String matricolaUB;
    private DataSource dataSource;
    private List<Query2Bean> query2BeanList;
    private List<Query6Bean> query6BeanList;
    private List<Query8Bean> query8BeanList;

    @PostConstruct
    public void initialize() {
        try {
            this.dataSource = new DataSource();
        } catch (ClassNotFoundException e) {
            this.dataSource = null;
        }
    }

    public String getMatricolaUB() {
        return matricolaUB;
    }

    public void setMatricolaUB(String matricolaUB) {
        this.matricolaUB = matricolaUB;
    }

    public String getLoginUB() {
        return loginUB;
    }

    public void setLoginUB(String loginUB) {
        this.loginUB = loginUB;
    }

    public String getPasswordUB() {
        return passwordUB;
    }

    public void setPasswordUB(String newValue) {
        passwordUB = newValue;
    }

    public String getStatus() {
        try {
            if (getLoginUB() == null && getPasswordUB() == null) {
                return "";
            }
        } catch (Exception exc) {
            return "";
        }
        if (status.equals("failure")) {
            setLoginUB("");
            setPasswordUB("");
            return "Credenziali errate! Riprova.";
        }
        return "";
    }

    public void setStatus(String newValue) {
        status = newValue;
    }

    public class riferimento {

        private String rife;

        public String getRife() {
            return rife;
        }

        public void setRife(String rife) {
            this.rife = rife;
        }

        public riferimento(String s) {
            this.rife = s;
        }
    }


    public String checkCredential() {
        QueryView queryView = new QueryView();
        queryView.initialize();
        for (Query2Bean query2Bean : queryView.getQuery2BeanList()) {
            if (loginUB.equals(query2Bean.getLogin()) && passwordUB.equals(query2Bean.getPw())) {
                status = "success";
                return "success";
            }
        }
        status = "failure";
        return "failure";
    }
    
    
     public String checkCredentialM() {
        QueryView queryView = new QueryView();
        queryView.initialize();
        for (Query2Bean query2Bean : queryView.getQuery2BeanList()) {
            if (loginUB.equals(query2Bean.getLogin()) && passwordUB.equals(query2Bean.getPw())) {
                status = "success";
                return "success";
            }
        }
        status = "failure";
        return "failure";
    }

    public List<Query2Bean> getResStringQuery5() {

        if (this.dataSource != null) {

            query2BeanList = dataSource.getQuery5(this.loginUB);
            if (query2BeanList.size() == 1) {
                this.matricolaUB = query2BeanList.get(0).getMat();
            }
        }
        return query2BeanList;
    }

    public List<Query6Bean> getResStringQuery6() {

        if (this.dataSource != null) {

            query6BeanList = dataSource.getQuery6(this.matricolaUB);
        }

        return query6BeanList;
    }

    public List<Query8Bean> getResStringQuery9(String oggeto) {

        if (this.dataSource != null) {

            query8BeanList = dataSource.getQuery9(oggeto);
        }

        return query8BeanList;
    }
}
