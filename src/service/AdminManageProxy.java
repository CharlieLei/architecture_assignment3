package service;

import model.admin.Permission;

public class AdminManageProxy implements AdminManageService {

    private AdminManageService adminManageService = new AdminManageImpl();

    @Override
    public void editLiteratureInfo(Permission permission) {
        if (permission.canEditLiteratureInfo()) {
            adminManageService.editLiteratureInfo(permission);
        }else {
            System.out.println("!!!!!!!!!!no permission to edit literature info!!!!!!!!!!");
        }
    }

    @Override
    public void showBorrowRecords(Permission permission) {
        if (permission.canShowBorrowRecords()) {
            adminManageService.showBorrowRecords(permission);
        }else {
            System.out.println("!!!!!!!!!!no permission to show borrow records!!!!!!!!!!");
        }
    }

    @Override
    public void showOverduePenalty(Permission permission) {
        if (permission.canShowOverduePenalty()) {
            adminManageService.showOverduePenalty(permission);
        } else {
            System.out.println("!!!!!!!!!!no permission to show overdue penalty!!!!!!!!!!");
        }
    }
}
