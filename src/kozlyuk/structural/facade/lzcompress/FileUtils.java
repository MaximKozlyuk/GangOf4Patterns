package kozlyuk.structural.facade.lzcompress;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class FileUtils {

    private final DictionaryTree tree;

    public FileUtils(DictionaryTree tree) {
        this.tree = tree;
    }

    public void writeTreeToFile(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(tree.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
