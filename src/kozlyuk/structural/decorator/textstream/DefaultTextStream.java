package kozlyuk.structural.decorator.textstream;

import java.io.IOException;
import java.io.Reader;

/**
    No special logic, just file reading
 */
public final class DefaultTextStream implements TextStream {

    private Reader reader;

    public DefaultTextStream(Reader reader) {
        this.reader = reader;
    }

    @Override
    public char nextChar() throws IOException {
        int read = reader.read();
        return read == -1 ? Character.MIN_VALUE : (char) read;
    }

    @Override
    public String nextChars(int n) throws IOException {
        char[] nChars = new char[n];
        reader.read(nChars);
        return new String(nChars);
    }

    @Deprecated() //only for test purposes
    public void setReader(Reader reader) {
        this.reader = reader;
    }

}
