package kozlyuk.structural.decorator.textstream;

import java.io.IOException;

public interface TextStream {

    char nextChar() throws IOException;

    default String nextChars(int n) throws IOException {
        char[] read = new char[n];
        for (int i = 0; i < n; i++) {
            read[i] = nextChar();
        }
        return new String(read);
    }

}
