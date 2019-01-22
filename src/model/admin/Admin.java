package model.admin;

public abstract class Admin {
    protected Permission managePermission;

    public Admin(Permission permission) {
         this.managePermission = permission;
    }

    public Permission getManagePermission() {
        return managePermission;
    }
}
