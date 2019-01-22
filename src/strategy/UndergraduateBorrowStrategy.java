package strategy;

import model.Book;

public class UndergraduateBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(Book book) {
        System.out.println("undergraduate borrow book");
    }
}
