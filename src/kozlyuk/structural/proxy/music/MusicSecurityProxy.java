package kozlyuk.structural.proxy.music;

import kozlyuk.structural.proxy.music.user.UserSession;

public final class MusicSecurityProxy implements MusicService {

    private final UserSession userSession;
    private final MusicService popularCache;

    public MusicSecurityProxy(UserSession userSession, MusicService popularCache) {
        this.userSession = userSession;
        this.popularCache = popularCache;
    }

    @Override
    public void streamSong(String songId) {
        if (userSession.checkSubscription()) {
            popularCache.streamSong(songId);
        } else {
            var thumbnailId = new ThumbnailLookup().thumbnailIdBySongId(songId);
            popularCache.streamSong(thumbnailId);
        }
    }

}
