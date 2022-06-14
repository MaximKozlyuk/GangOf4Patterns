package kozlyuk.structural.facade;

import kozlyuk.structural.facade.lzcompress.Compressor;
import kozlyuk.structural.facade.lzcompress.Decompressor;

import java.io.File;
import java.net.URI;
import java.util.List;

public class CompressionFacade implements Compression {

    @Override
    public File compress(URI source, URI result, CompressionRatio ratio ) {
        if (source == null || result == null) {
            throw new IllegalArgumentException("Required file path is missing.");
        }
        System.out.println("Compressing file " + source + " with " + ratio + " ratio, writing to " + result);
        File sourceFile = new File(source);
        File resultFile = new File(result);
        List<Integer> params = ratio.params;
        new Compressor(sourceFile, resultFile)
                .compress(params.get(0), params.get(1), params.get(2), params.get(3));
        return resultFile;
    }

    @Override
    public File unCompress(URI path) {
        return new Decompressor(path).decompress(Runtime.getRuntime().availableProcessors() / 2);
    }

}
