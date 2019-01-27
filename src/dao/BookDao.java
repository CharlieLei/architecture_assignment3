package dao;

import factory.reader.ExcelFactory;
import factory.reader.PDFFactory;
import factory.reader.ReaderFactory;
import factory.reader.WordFactory;
import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    private List<Book> bookList = new ArrayList<>();
    private static BookDao instance = new BookDao();

    private BookDao() {
        bookList.add(new Book("book1", "book_1.pdf", "pdf"));
        bookList.add(new Book("book2", "book_2.docx", "word"));
        bookList.add(new Book("book3", "book_3.xls", "excel"));
    }

    public static BookDao getInstance() {
        return instance;
    }

    public Book getBook(String bookId) {
        for (Book book: bookList) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public void readBook(String bookId) {
        ReaderFactory readerFactory = new ExcelFactory();
        for (Book book: bookList) {
            if (book.getBookId().equals(bookId)) {
                switch (book.getFileType()) {
                    case "pdf":
                        readerFactory = new PDFFactory();
                        break;
                    case "word":
                        readerFactory = new WordFactory();
                        break;
                    case "excel":
                        readerFactory = new ExcelFactory();
                        break;
                    default:
                        System.out.println("error file type");
                        break;
                }
                readerFactory.read(book.getBookName());
            }
        }
//        if (kind ==1) {
//            PDFFactory pdfFactory = new PDFFactory();
//            pdfFactory.read("2018_DsgnArch01_Introduction.pdf");
//        }else if (kind ==2) {
//            WordFactory wordFactory = new WordFactory();
//            wordFactory.read("assignment-3.docx");
//        }else if (kind ==3) {
//            ExcelFactory excelFactory = new ExcelFactory();
//            excelFactory.read("a.xls");
//        }else {
//
//        }
    }

    public void showAllBooks() {
        for (Book book: bookList) {
            System.out.print("bookId: ");
            System.out.println(book.getBookId());
            System.out.print("bookName: ");
            System.out.println(book.getBookName());
        }
    }
}
