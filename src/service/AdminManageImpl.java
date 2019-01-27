package service;

import dao.BookDao;
import dao.BorrowRecordDao;
import model.Book;
import model.admin.Permission;

import java.util.Scanner;

public class AdminManageImpl implements AdminManageService {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void editLiteratureInfo(Permission permission) {
        BookDao bookDao = BookDao.getInstance();
        bookDao.showAllBooks();
        System.out.print("Which one you want to change(input bookId): ");

        String bookId = scanner.nextLine();
        Book book = bookDao.getBook(bookId);
        if (book != null) {
            System.out.print("New book name: ");
            String bookName = scanner.nextLine();
            book.setBookName(bookName);
        }else {
            System.out.println("!!!!!!!!!!!!!!Wrong bookId!!!!!!!!!!!!!");
        }
    }

    @Override
    public void showBorrowRecords(Permission permission) {
        BorrowRecordDao borrowRecordDao = BorrowRecordDao.getInstance();
        borrowRecordDao.showBorrowRecord();
    }

    @Override
    public void showOverduePenalty(Permission permission) {
        System.out.println("show overdue penalty");
    }
}
