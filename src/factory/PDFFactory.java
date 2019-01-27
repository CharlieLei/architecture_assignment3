package factory;

import Reader.PDFReader;

public class PDFFactory implements ReaderFactory{
    @Override
    public void read(String filepath) {
        PDFReader pdfReader = new PDFReader();
        pdfReader.PDFReader(filepath);
    }
}
