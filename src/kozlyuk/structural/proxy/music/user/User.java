package kozlyuk.structural.proxy.music.user;

public final class User {

    private final String id;
    private final String name;
    private boolean subscription = false;
    private final String networkAddress;

    public User(String id, String name, String networkAddress) {
        this.id = id;
        this.name = name;
        this.networkAddress = networkAddress;
    }

    public String getNetworkAddress() {
        return networkAddress;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean hasSubscription() {
        return subscription;
    }

    void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }
}
