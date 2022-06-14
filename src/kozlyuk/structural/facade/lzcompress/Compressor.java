package kozlyuk.structural.facade.lzcompress;

import java.io.File;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Compressor {

    private final File source;
    private final File result;

    public Compressor(File source, File result) {
        this.source = source;
        this.result = result;
    }

    public BigInteger compress(int dataChunkPowSize, int wordSize, int dictionarySize, int threadAmount) {
        if (source == null || result == null) {
            throw new IllegalArgumentException("No file to compress or write result to!");
        }
        int threads = Runtime.getRuntime().availableProcessors();
        if (dataChunkPowSize < 20
                || dataChunkPowSize > 36
                || wordSize < 0 || wordSize > 10
                || !isPowerOfTwo(dictionarySize)
                || threadAmount < 0
                || threadAmount > threads) {
            throw new IllegalArgumentException("Illegal parameter!");
        }
        if (threadAmount > 1) {
            return compressMultiThreadInternal(dataChunkPowSize, wordSize, dictionarySize);
        }
        return compressInternal(dataChunkPowSize, wordSize, dictionarySize);
    }

    /**
     * High-level pseudo code compression algorithm
     * @return compressed file size in bytes
     */
    private BigInteger compressInternal(int dataChunkSize, int wordSize, int dictionarySize) {
        DictionaryTree tree = new DictionaryTree(dictionarySize);
        int wordCount = 0;
        List<TreeNode> seq = new LinkedList<>();
        Iterator<byte[]> iterator = new WordIterator(wordSize, source).iterator();
        boolean isFull;
        while (iterator.hasNext()) {
            byte[] currentWord = iterator.next();
            seq.add(new TreeNode(wordCount++, currentWord));
            if (!tree.contains(seq)) {
                 isFull = tree.addSequence(seq);
                 if (isFull) {
                     new FileUtils(tree).writeTreeToFile(result);
                     tree = new DictionaryTree(dictionarySize);
                 }
                seq.clear();
            }
        }
        return new BigInteger("125675641");
    }

    private BigInteger compressMultiThreadInternal(int dataChunkSize, int wordSize, int dictionarySize) {
        // multi thread compression impl
        return new BigInteger("125642341");
    }

    private boolean isPowerOfTwo(int val) {
        return val != 0 && ((val & (val - 1)) == 0);
    }

}
