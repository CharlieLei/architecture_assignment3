package dao;

import factory.ExcelFactory;
import factory.PDFFactory;
import factory.WordFactory;

public class BookDao {
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
