package dao;

import factory.ExcelFactory;
import factory.PDFFactory;
import factory.WordFactory;
import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    private List<Book> bookList = new ArrayList<>();
    private static BookDao instance = new BookDao();

    public BookDao() {
        bookList.add(new Book("book1", "book_1"));
        bookList.add(new Book("book2", "book_2"));
        bookList.add(new Book("book3", "book_3"));
    }

    public static BookDao getInstance() {
        return instance;
    }

    public void getReader(int kind) {
        if (kind ==1) {
            PDFFactory pdfFactory = new PDFFactory();
            pdfFactory.read("2018_DsgnArch01_Introduction.pdf");
        }else if (kind ==2) {
            WordFactory wordFactory = new WordFactory();
            wordFactory.read("assignment-3.docx");
        }else if (kind ==3) {
            ExcelFactory excelFactory = new ExcelFactory();
            excelFactory.read("a.xls");
        }else {

        }
    }
}
