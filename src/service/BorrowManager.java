package service;

import model.Book;
import model.user.User;

public class BorrowManager {
    public void borrow(User user, String bookId) {
        user.borrow(bookId);
    }
}
