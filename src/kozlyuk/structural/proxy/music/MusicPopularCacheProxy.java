package kozlyuk.structural.proxy.music;

import kozlyuk.structural.proxy.music.user.UserSession;
import kozlyuk.structural.proxy.util.DataSender;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public final class MusicPopularCacheProxy implements MusicService {

    public static final ConcurrentHashMap<String, byte[]> cache = new ConcurrentHashMap<>();

    private final DataMusicService musicDataService;
    private final DataSender sender;

    public MusicPopularCacheProxy(UserSession userSession) {
        this.sender = new DataSender(userSession.user.getNetworkAddress());
        this.musicDataService = new DataMusicService(userSession);
    }

    @Override
    public void streamSong(String songId) {
        var cacheData = cache.get(songId);
        if (cacheData == null) {
            musicDataService.streamSong(songId);
        } else {
            try {
                sender.sendData(cacheData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
