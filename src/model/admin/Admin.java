package model.admin;

public abstract class Admin {
    private String userid;
    private String password;
    protected Permission managePermission;

    public Admin(String userid, String password, Permission managePermission) {
        this.userid = userid;
        this.password = password;
        this.managePermission = managePermission;
    }

    public Permission getManagePermission() {
        return managePermission;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }
}
