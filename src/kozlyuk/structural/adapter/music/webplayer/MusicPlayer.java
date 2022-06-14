package kozlyuk.structural.adapter.music.webplayer;

import kozlyuk.structural.adapter.music.webplayer.dataadapter.AppleMusicDataAdapter;
import kozlyuk.structural.adapter.music.webplayer.dataadapter.MusicDataAdapter;
import kozlyuk.structural.adapter.music.webplayer.dataadapter.SpotifyDataAdapter;

public final class MusicPlayer {

    private final String theSongName = "Happy New Year!";

    private final MusicDataAdapter spotify = new SpotifyDataAdapter(theSongName);
    private final MusicDataAdapter appleMusic = new AppleMusicDataAdapter(theSongName);

    public void playSongOnSpotify() {
        playThroughAdapter(spotify);
    }

    public void playSongOnAppleMusic() {
        playThroughAdapter(appleMusic);
    }

    private void playThroughAdapter(MusicDataAdapter adapter) {
        byte[] currentData;
        for (int i = 100; ; i+=100) {
            currentData = adapter.songPartToPlay(i);
            if (currentData == null) {
                return;
            }
            playDataPart(currentData);
        }
    }

    private void playDataPart(byte[] data) {
        // writing song data in client sound device to actually play data
    }

}
