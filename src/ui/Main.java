package ui;

import model.Book;
import model.user.Graduate;
import model.user.Teacher;
import model.user.User;
import service.BorrowManager;
import strategy.GraduateBorrowStrategy;
import strategy.TeacherBorrowStrategy;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isUserLogin = false;
    private User loginUser;

    public static void main(String[] args) {
        Main main = new Main();
        String order = "";
        boolean isQuit = false;
        while (!isQuit) {
            if (isUserLogin) {
                System.out.print("order: ");
                order = scanner.nextLine();
                switch (order) {
                    case "login":
                        main.login();
                        break;
                    case "borrow":
                        main.borrow();
                        break;
                    case "logout":
                        main.logout();
                        break;
                    case "quit":
                        isQuit = true;
                        break;
                }
            }else {
                System.out.println("please login");
                main.login();
            }
        }
    }

    private void login() {
        System.out.print("input user id: ");
        String userId = scanner.nextLine();
        System.out.print("input user password: ");
        String password = scanner.nextLine();

        if (userId.equals("teacher")) {
            loginUser = new Teacher(new TeacherBorrowStrategy());
        }else {
            loginUser = new Graduate(new GraduateBorrowStrategy());
        }
        isUserLogin = true;
    }

    private void borrow() {
        BorrowManager borrowManager = new BorrowManager();

        System.out.print("which book: ");
        String bookId = scanner.nextLine();

        borrowManager.borrow(loginUser, new Book());
    }

    private void logout() {
        isUserLogin = false;
    }
}
