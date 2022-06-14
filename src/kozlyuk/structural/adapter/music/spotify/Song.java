package kozlyuk.structural.adapter.music.spotify;

// represents Spotify song data and metadata.
// Supports loading arbitrary song part
public final class Song {

    private final String id;
    private final String title;
    private final Format dataFormat;
    private final long msStart;
    private byte[] buffer;

    // playing song from beginning
    public Song(String id, String title, Format dataFormat) {
        this.id = id;
        this.title = title;
        this.dataFormat = dataFormat;
        this.msStart = 0;
    }

    public Song(String id, String title, Format dataFormat, long msStart) {
        this.id = id;
        this.title = title;
        this.dataFormat = dataFormat;
        this.msStart = msStart;
    }

    public byte[] loadDataChunk(long msStart, long msEnd) {
        // going to web service, loading next song part to play...
        return new byte[]{1, 2, 3, 4, 5};
    }

}
