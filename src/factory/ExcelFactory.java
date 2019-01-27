package factory;

import Reader.ExcelReader;

import java.io.IOException;

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
