package strategy;

import model.Book;

public class GraduateBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(String bookId) {
        System.out.println("graduate borrow book");
    }
}
