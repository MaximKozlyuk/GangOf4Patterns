package kozlyuk.structural.adapter.music.applemusic;

import java.math.BigInteger;

// 3rd party API, represents musical service
public final class AppleMusic {

    public Track findTrackByTitle(String title, AppleAudioFormat format) {
        if (title == null) {
            throw new IllegalArgumentException("Null argument!");
        }
        if (format == null) {
            format = AppleAudioFormat.ALAC;
        }
        // going to apple service and searching for most relevant song...
        byte[] data = new byte[]{};
        try {
            data = loadData(format);
        } catch (RuntimeException exp) {
            System.out.println("Error loading song data!" + exp.getMessage());
        }
        return new Track("Abba: Happy New Year!","2022", data);
    }

    // return all song data, because API can only download whole song
    // support multiple data formats
    private byte[] loadData(AppleAudioFormat dataFormat) throws RuntimeException {
        // loading song data in accordance with data format...
        return new byte[]{1,2,3,15};
    }

}
