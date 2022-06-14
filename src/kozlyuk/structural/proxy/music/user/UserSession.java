package kozlyuk.structural.proxy.music.user;

import java.util.Random;

public final class UserSession {

    public final User user;

    public UserSession(User user) {
        this.user = user;
    }

    User getUser() {
        return user;
    }

    public boolean checkSubscription() {
        var random = new Random(System.currentTimeMillis());
        user.setSubscription(random.nextBoolean());
        return user.hasSubscription();
    }

}
