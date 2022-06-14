package kozlyuk.structural.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * List of prepared parameters for underlying compression algorithm
 */
public enum CompressionRatio {

    FASTEST(List.of(8,2,128,1)),
    FAST(List.of(9,2,256,1)),
    NORMAL(List.of(10,4,512,2)),
    SLOW(List.of(11,4,1024,2)),
    MAX(List.of(12,8,4096,4));

    final List<Integer> params;

    CompressionRatio(List<Integer> params) {
        this.params = new ArrayList<>(params);
    }
}
