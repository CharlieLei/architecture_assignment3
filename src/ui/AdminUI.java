package ui;

import model.admin.Admin;
import service.AdminManageProxy;
import service.AdminManageService;

import java.util.Scanner;

public class AdminUI {
    private static final Scanner scanner = new Scanner(System.in);

    public void showAdminUI(Admin admin) {
        boolean isQuit = false;
        String order = "";
        while (!isQuit) {
            System.out.println("admin console");
            System.out.print("order: ");
            order = scanner.nextLine();
            switch (order) {
                case "edit":
                    this.editLiteratureInfo(admin);
                    break;
                case "show borrow records":
                    this.showBorrowRecords(admin);
                    break;
                case "show overdue penalty":
                    this.showOverduePenalty(admin);
                    break;
                case "quit":
                    isQuit = true;
                    break;
            }
        }
    }

    private void editLiteratureInfo(Admin admin) {
        AdminManageService adminManageService = new AdminManageProxy();
        adminManageService.editLiteratureInfo(admin.getManagePermission());
    }

    private void showBorrowRecords(Admin admin) {
        AdminManageService adminManageService = new AdminManageProxy();
        adminManageService.showBorrowRecords(admin.getManagePermission());
    }

    private void showOverduePenalty(Admin admin) {
        AdminManageService adminManageService = new AdminManageProxy();
        adminManageService.showOverduePenalty(admin.getManagePermission());
    }
}
