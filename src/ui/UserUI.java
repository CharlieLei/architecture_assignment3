package ui;

import model.Book;
import model.user.User;
import service.BorrowManager;

import java.util.Scanner;

public class UserUI {
    private static final Scanner scanner = new Scanner(System.in);

    public void showUserUI(User loginUser) {
        boolean isQuit = false;
        String order = "";
        while (!isQuit) {
            System.out.println("user console");
            System.out.print("order: ");
            order = scanner.nextLine();
            switch (order) {
                case "borrow":
                    this.borrow(loginUser);
                    break;
                case "logout":
                    isQuit = true;
                    break;
            }
        }
    }

    private void borrow(User user) {
        BorrowManager borrowManager = new BorrowManager();

        System.out.print("which book: ");
        String bookId = scanner.nextLine();

        borrowManager.borrow(user, new Book());
    }
}
