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

    public static void main(String[] args) {
        LibraryManageSystem libraryManageSystem = new LibraryManageSystem();
        boolean isQuit = false;
        while (!isQuit) {
            System.out.println("login? quit?");
            System.out.print("$: ");
            String command = scanner.nextLine();
            switch (command) {
                case "login":
                    libraryManageSystem.login();
                    break;
                case "quit":
                    isQuit = true;
                    break;
            }
        }
    }

    private void login() {
        this.showAllUserAndAdmin();

        System.out.println("###########please login###########");
        System.out.print("input user id: ");
        String userId = scanner.nextLine();
        System.out.print("input user password: ");
        String password = scanner.nextLine();

        UserDao userDao = UserDao.getInstance();
        AdminDao adminDao = AdminDao.getInstance();
        boolean isUser = userDao.isUser(userId);
        boolean isAdmin = adminDao.isAdmin(userId);

        if (isUser) {
            User user = userDao.getUser(userId, password);

            if (user == null) {
                System.out.println("!userId or password error!");
                return;
            }

            UserUI userUI = new UserUI();
            userUI.showUserUI(user);
        }else if (isAdmin){
            Admin admin = adminDao.getAdmin(userId, password);

            if (admin == null) {
                System.out.println("!userId or password error!");
                return;
            }

            AdminUI adminUI = new AdminUI();
            adminUI.showAdminUI(admin);
        }else {
            System.out.println("!!!!!!!!!!!!!userId or password error!!!!!!!!!!!!!");
        }
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
