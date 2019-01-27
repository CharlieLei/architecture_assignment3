package factory;

import Reader.WordReader;

public class WordFactory implements ReaderFactory{
    @Override
    public void read(String filepath) {
        WordReader wordReader = new WordReader();
        wordReader.WordReader(filepath);
    }
}
