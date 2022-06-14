package kozlyuk.structural.facade;

import java.io.File;
import java.net.URI;

public interface Compression {

    File compress(URI source, URI result, CompressionRatio ratio);

    File unCompress(URI path);

}
