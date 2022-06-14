package kozlyuk.structural.adapter.music.webplayer.dataadapter;

// Retrieve any sized song data array
public interface MusicDataAdapter {

    byte[] songPartToPlay(long msStart);

}
