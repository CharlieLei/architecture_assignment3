package service;

import model.admin.Permission;

public class AdminManageImpl implements AdminManageService {

    @Override
    public void editLiteratureInfo(Permission permission) {
        System.out.println("edit literature info");
    }

    @Override
    public void showBorrowRecords(Permission permission) {
        System.out.println("show borrow records");
    }

    @Override
    public void showOverduePenalty(Permission permission) {
        System.out.println("show overdue penalty");
    }
}
