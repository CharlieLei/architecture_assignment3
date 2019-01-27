package factory.reader;

import Reader.ExcelReader;

public class ExcelFactory implements ReaderFactory
{
    @Override
    public void read(String filepath) {
        ExcelReader excelReader = new ExcelReader();
        try {
            excelReader.ExcelReader(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
