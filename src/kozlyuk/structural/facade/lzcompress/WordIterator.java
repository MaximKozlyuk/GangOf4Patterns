package kozlyuk.structural.facade.lzcompress;

import java.io.File;
import java.util.Iterator;
import java.util.function.Consumer;

public final class WordIterator implements Iterable<byte[]> {

    private final int wordSize;
    private final File file;

    public WordIterator(int wordSize, File file) {
        this.wordSize = wordSize;
        this.file = file;
    }

    @Override
    public Iterator<byte[]> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public byte[] next() {
                // iterating over file till end, returning []byte of wordSize size
                return new byte[0];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super byte[]> action) {
        // implementation
    }
}
