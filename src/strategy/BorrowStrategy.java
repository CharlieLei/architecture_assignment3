package strategy;

import model.Book;
import model.user.User;

public interface BorrowStrategy {
    public void borrow(User user, String bookId);
}
