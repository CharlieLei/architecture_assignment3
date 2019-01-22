package ui;

import model.Book;
import model.admin.Admin;
import model.admin.DepartmentA;
import model.admin.Permission;
import model.user.Graduate;
import model.user.Teacher;
import model.user.User;
import service.BorrowManager;
import strategy.GraduateBorrowStrategy;
import strategy.TeacherBorrowStrategy;

import java.util.Scanner;

public class LibraryManageSystem {

    private static final Scanner scanner = new Scanner(System.in);
    private static String visitorType = null;
    private static User user;
    private static Admin admin;
    private static boolean isLogin = false;

    public static void main(String[] args) {
        LibraryManageSystem libraryManageSystem = new LibraryManageSystem();
        String order = "";
        boolean isQuit = false;
        while (!isQuit) {
            if (isLogin) {
                switch (visitorType) {
                    case "user":
                        UserUI userUI = new UserUI();
                        userUI.showUserUI(user);
                        break;
                    case "admin":
                        AdminUI adminUI = new AdminUI();
                        adminUI.showAdminUI(admin);
                }
                isLogin = false;
            }else {
                System.out.println("please login");
                libraryManageSystem.login();
            }
        }
    }

    private void login() {
        System.out.print("input user id: ");
        String userId = scanner.nextLine();
        System.out.print("input user password: ");
        String password = scanner.nextLine();

        if (userId.equals("teacher")) {
            visitorType = "user";
            user = new Teacher(new TeacherBorrowStrategy());
        }else {
            visitorType = "admin";
            admin = new DepartmentA(new Permission());
        }
        isLogin = true;
    }

    private void logout() {
    }
}
