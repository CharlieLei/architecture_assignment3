package service;

import model.admin.Permission;

public interface AdminManageService {
    public void editLiteratureInfo(Permission permission);
    public void showBorrowRecords(Permission permission);
    public void showOverduePenalty(Permission permission);
}
