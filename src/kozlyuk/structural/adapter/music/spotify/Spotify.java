package kozlyuk.structural.adapter.music.spotify;

public final class Spotify {

    public Song songByTitle(String title, Format dataFormat, long msStart) {
        if (title == null || msStart < 0) {
            throw new IllegalArgumentException("Allegal argument");
        }
        if (dataFormat == null) {
            dataFormat = Format.WAV;
        }
        // searching for most relevant song metadata
        return new Song("2022", "Abba: Happy New Year!", dataFormat, msStart);
    }

}
