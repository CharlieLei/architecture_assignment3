package strategy;

import dao.BookDao;
import dao.BorrowRecordDao;
import model.Book;
import model.BorrowRecordItem;
import model.user.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GraduateBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(User user, String bookId) {
        if (user.getHasBorrowedNum() < 2) {
            user.setHasBorrowedNum(user.getHasBorrowedNum() + 1);

            BorrowRecordDao borrowRecordDao = BorrowRecordDao.getInstance();
            borrowRecordDao.addBorrowRecordItem(new BorrowRecordItem(user.getUserid(), bookId, Timestamp.valueOf(LocalDateTime.now())));

            System.out.println(user.getUsername() + " borrows " + bookId);
        }else {
            System.out.println("You have borrowed too much books!");
        }
    }
}
