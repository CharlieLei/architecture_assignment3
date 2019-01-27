package factory;

import model.admin.Admin;
import model.admin.DepartmentA;
import model.admin.Permission;

public class DepartmentAFactory implements AdminFactory {
    @Override
    public Admin getAdmin() {
        Permission permission = new Permission();
        permission.setEditLiteratureInfoPermission(true);
        permission.setShowBorrowRecordsPermission(true);
        permission.setShowOverduePenaltyPermission(true);
        return new DepartmentA("departA", "123456", permission);
    }
}
