package strategy;

import model.Book;

public interface BorrowStrategy {
    public void borrow(Book book);
}
