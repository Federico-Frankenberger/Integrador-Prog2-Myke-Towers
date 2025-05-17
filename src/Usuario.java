public class Usuario {
    private String auth0Id;
    private String userName;

    public Usuario(String auth0Id, String userName) {
        this.auth0Id = auth0Id;
        this.userName = userName;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
