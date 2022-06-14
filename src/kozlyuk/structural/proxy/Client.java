package kozlyuk.structural.proxy;

import kozlyuk.structural.proxy.music.MusicPopularCacheProxy;
import kozlyuk.structural.proxy.music.MusicSecurityProxy;
import kozlyuk.structural.proxy.music.user.User;
import kozlyuk.structural.proxy.music.user.UserSession;

public final class Client {

    public void action() {
        // getting user session data from REST API
        var userSession = new UserSession(
                new User(
                        "12345",
                        "Ivan",
                        "142.157.543.32"
                )
        );
        // "IOC Container"
        var cache = new MusicPopularCacheProxy(userSession);
        var songId = "rumka_vodki_on_the_table_2002";

        var proxy = new MusicSecurityProxy(userSession, cache);
        proxy.streamSong(songId);

    }

}
