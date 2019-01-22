package strategy;

import model.Book;

public class TeacherBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(Book book) {
        System.out.println("teacher borrow book");
    }
}
