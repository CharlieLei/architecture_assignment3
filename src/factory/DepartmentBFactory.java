package factory;

import model.admin.Admin;
import model.admin.DepartmentB;
import model.admin.Permission;

public class DepartmentBFactory implements AdminFactory {
    @Override
    public Admin getAdmin() {
        Permission permission = new Permission();
        permission.setEditLiteratureInfoPermission(true);
        permission.setShowBorrowRecordsPermission(false);
        permission.setShowOverduePenaltyPermission(false);
        return new DepartmentB(permission);
    }
}
