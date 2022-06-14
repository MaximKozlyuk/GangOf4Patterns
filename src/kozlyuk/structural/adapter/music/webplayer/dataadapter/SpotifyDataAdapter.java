package kozlyuk.structural.adapter.music.webplayer.dataadapter;

import kozlyuk.structural.adapter.music.spotify.Format;
import kozlyuk.structural.adapter.music.spotify.Song;
import kozlyuk.structural.adapter.music.spotify.Spotify;

public final class SpotifyDataAdapter implements MusicDataAdapter {

    private final Spotify spotify = new Spotify();
    private final String title;
    private final Song song;

    public SpotifyDataAdapter(String title) {
        this.title = title;
        this.song = spotify.songByTitle(title, Format.WAV, 0);
    }

    @Override
    public byte[] songPartToPlay(long msStart) {
        return song.loadDataChunk(msStart, msStart + 100);
    }

    public String getTitle() {
        return title;
    }
}
