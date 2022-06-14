package kozlyuk.structural.adapter;

import kozlyuk.structural.adapter.music.webplayer.MusicPlayer;

// Simple client example
public class Client {

    private final MusicPlayer player = new MusicPlayer();

    public void playSpotify() {
        player.playSongOnSpotify();
    }

    public void playAppleMusic() {
        player.playSongOnAppleMusic();
    }

}
