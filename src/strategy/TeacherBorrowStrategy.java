package strategy;

import model.Book;

public class TeacherBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(String bookId) {
        System.out.println("teacher borrow book");
    }
}
