package kozlyuk.structural.facade.lzcompress;

import java.util.List;

public final class DictionaryTree {

    private final int dictionarySize;
    private final TreeNode root;
    private int size = 0;

    public DictionaryTree(int dictionarySize) {
        this.dictionarySize = dictionarySize;
        this.root = new TreeNode(0, new byte[]{});
    }

    public boolean contains(List<TreeNode> sequence) {
        // checking is this pattern already in tree
        return true;
    }

    /**
     * @Return true if dictionary is full
     */
    public boolean addSequence(List<TreeNode> sequence) {
        // logic of adding new node sequence to the tree
        return size + 1 > dictionarySize;
    }

}
