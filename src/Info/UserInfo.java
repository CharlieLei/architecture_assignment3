package Info;

public abstract class UserInfo {
    private String userid;
    private String username;
    private String password;

    public UserInfo(String userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public void setUsernameAndPassword(String userid, String username, String password){
        this.userid = userid;
        this.password = password;
        this.username = username;
        this.setMessageToAdmin(userid,"Username and Password");
    }
    public void setUsername(String userid,String username){
        this.userid = userid;
        this.username = username;
        this.setMessageToAdmin(userid,"Username");
    }
    public void setPassword(String userid,String password){
        this.userid = userid;
        this.password = password;
        this.setMessageToAdmin(userid,"Password");
    }
    public void setMessageToAdmin(String userid,String kind){
        System.out.println("User:"+userid+" has changed his/her " + kind +" information.");
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
