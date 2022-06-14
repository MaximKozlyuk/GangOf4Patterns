package kozlyuk.structural.adapter.music.applemusic;

import java.util.Arrays;

public final class Track {

    private final String id;
    private final String title;
    private final byte[] data;

    private int currentSecond = 0;

    public Track(String id, String title, byte[] data) {
        this.id = id;
        this.title = title;
        this.data = data;
    }

    public byte[] nextSecondData() {
        return Arrays.copyOfRange(
                data,
                resolveByteAmountInSecond(currentSecond++),
                resolveByteAmountInSecond(currentSecond));
    }

    private int resolveByteAmountInSecond(int second) {
        // some complex logic / 3rd party libs usage to determine and return current second byte array length...
        return 1024;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
