package strategy;

import dao.BookDao;
import model.Book;
import model.user.User;

public class GraduateBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(User user, String bookId) {
        if (user.getHasBorrowedNum() < 2) {
            user.setHasBorrowedNum(user.getHasBorrowedNum() + 1);
            System.out.println(user.getUsername() + " borrows " + bookId);
        }else {
            System.out.println("You have borrowed too much books!");
        }
    }
}
