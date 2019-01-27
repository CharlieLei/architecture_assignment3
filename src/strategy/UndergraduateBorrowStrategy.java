package strategy;

import model.Book;

public class UndergraduateBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(String bookId) {
        System.out.println("undergraduate borrow book");
    }
}
