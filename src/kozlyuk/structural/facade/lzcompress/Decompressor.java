package kozlyuk.structural.facade.lzcompress;

import java.io.File;
import java.net.URI;

public final class Decompressor {

    private final URI uri;

    public Decompressor(URI uri) {
        this.uri = uri;
    }

    public File decompress(int numThreads) {
        File compressedFile = new File(uri);
        // reading compressed file structure, building tree again to recreate uncompressed file.
        return compressedFile;
    }

}
