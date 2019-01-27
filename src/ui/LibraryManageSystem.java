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
        libraryManageSystem.showAllUserAndAdmin();
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

        UserDao userDao = UserDao.getInstance();
        AdminDao adminDao = AdminDao.getInstance();
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

    private void showAllUserAndAdmin() {
        System.out.println("###########only for testing###########");
        UserDao userDao = UserDao.getInstance();
        AdminDao adminDao = AdminDao.getInstance();
        System.out.println("-----------------users---------------");
        userDao.showAllUser();
        System.out.println("----------------admins---------------");
        adminDao.showAllAdmin();
        System.out.println("#####################################");
    }
}
