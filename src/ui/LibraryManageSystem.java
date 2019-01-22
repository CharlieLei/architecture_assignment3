package ui;

import dao.AdminDao;
import dao.UserDao;
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

    public static void main(String[] args) {
        LibraryManageSystem libraryManageSystem = new LibraryManageSystem();
        String order = "";
        boolean isQuit = false;
        while (!isQuit) {
            System.out.println("please login");
            libraryManageSystem.login();
            switch (visitorType) {
                case "user":
                    UserUI userUI = new UserUI();
                    userUI.showUserUI(user);
                    break;
                case "admin":
                    AdminUI adminUI = new AdminUI();
                    adminUI.showAdminUI(admin);
                    break;
            }
        }
    }

    private void login() {
        System.out.print("input user id: ");
        String userId = scanner.nextLine();
        System.out.print("input user password: ");
        String password = scanner.nextLine();

        UserDao userDao = new UserDao();
        AdminDao adminDao = new AdminDao();
        boolean isUser = userDao.isUser(userId);
        boolean isAdmin = adminDao.isAdmin(userId);

        if (isUser) {
            visitorType = "user";
            user = userDao.getUser(userId, password);
        }else if (isAdmin){
            visitorType = "admin";
            admin = adminDao.getAdmin(userId, password);
        }
    }

    private void logout() {
    }
}
