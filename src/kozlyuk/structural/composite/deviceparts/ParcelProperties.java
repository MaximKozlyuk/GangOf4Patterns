package kozlyuk.structural.composite.deviceparts;

public class ParcelProperties {

    private final String name;
    private final String description;
    private final double weight;
    private final double cost;

    public ParcelProperties(String name, String description, double weight, double cost) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.cost = cost;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public double weight() {
        return weight;
    }

    public double cost() {
        return cost;
    }

}
