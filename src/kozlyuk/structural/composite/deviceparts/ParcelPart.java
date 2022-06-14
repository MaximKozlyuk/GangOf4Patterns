package kozlyuk.structural.composite.deviceparts;

public interface ParcelPart extends AbstractComposite {

    String name();
    String description();

    double weight();
    double allWeight();

    double cost();
    double allCost();

}
