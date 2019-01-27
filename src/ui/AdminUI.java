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
            System.out.println("##################admin console#################");
            System.out.println("#########input 'list' to show all commands######");
            System.out.print("$: ");
            order = scanner.nextLine();
            switch (order) {
                case "edit":
                    this.editLiteratureInfo(admin);
                    break;
                case "showBorrowRecords":
                    this.showBorrowRecords(admin);
                    break;
                case "showOverduePenalty":
                    this.showOverduePenalty(admin);
                    break;
                case "list":
                    this.showAllCommand();
                    break;
                case "logout":
                    isQuit = true;
                    break;
                default:
                    System.out.println("wrong command!");
                    System.out.println("input list to get all commands");
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

    private void showAllCommand() {
        System.out.println("#################all commands###############");
        System.out.println("edit");
        System.out.println("showBorrowRecords");
        System.out.println("showOverduePenalty");
        System.out.println("list");
        System.out.println("logout");
        System.out.println("############################################");
    }
}
