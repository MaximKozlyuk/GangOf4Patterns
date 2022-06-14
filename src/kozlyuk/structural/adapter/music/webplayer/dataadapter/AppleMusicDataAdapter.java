package kozlyuk.structural.adapter.music.webplayer.dataadapter;

import kozlyuk.structural.adapter.music.applemusic.AppleAudioFormat;
import kozlyuk.structural.adapter.music.applemusic.AppleMusic;
import kozlyuk.structural.adapter.music.applemusic.Track;

import java.util.ArrayList;
import java.util.List;

public final class AppleMusicDataAdapter implements MusicDataAdapter {

    private final String title;
    private final Track track;

    private final List<byte[]> allSongData = new ArrayList<>();

    public AppleMusicDataAdapter(String title) {
        this.title = title;
        track = new AppleMusic().findTrackByTitle(title, AppleAudioFormat.WAV);
        init();
    }

    // AppleMusic can only return all song second by second starting from second 0.
    private void init() {
        byte[] currentSecondData = track.nextSecondData();
        while (currentSecondData != null) {
            allSongData.add(currentSecondData);
            currentSecondData = track.nextSecondData();
        }
    }

    @Override
    public byte[] songPartToPlay(long msStart) {
        return allSongData.get((int)msStart / 100);
    }

    public String getTitle() {
        return title;
    }
}
