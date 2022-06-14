package kozlyuk.structural.proxy.music;

/**
 * Subject interface
 */
public interface MusicService {

    /**
     * Streams full song only if user has subscription
     */
    void streamSong(String songId);

}
