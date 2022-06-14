package kozlyuk.structural.facade.lzcompress;

import java.util.ArrayList;
import java.util.List;

public final class TreeNode {

    private final int id;
    private final byte[] word;
    private final List<byte[]> children = new ArrayList<>();

    public TreeNode(int id, byte[] word) {
        this.id = id;
        this.word = word;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
