package kozlyuk.structural.composite.deviceparts;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class DefaultParcelPart implements ParcelPart {

    private final BigInteger id;
    private final ParcelProperties properties;

    private final List<ParcelPart> parts = new ArrayList<>();

    public DefaultParcelPart(BigInteger id, ParcelProperties properties) {
        this.id = id;
        this.properties = properties;
    }

    @Override
    public BigInteger id() {
        return id;
    }

    @Override
    public String name() {
        return properties.name();
    }

    @Override
    public String description() {
        return properties.description();
    }

    @Override
    public double weight() {
        return properties.weight();
    }

    @Override
    public double allWeight() {
        return weight() + parts.stream().mapToDouble(ParcelPart::allWeight).sum();
    }

    @Override
    public double cost() {
        return properties.cost();
    }

    @Override
    public double allCost() {
        return cost() + parts.stream().mapToDouble(ParcelPart::allCost).sum();
    }

    @Override
    public boolean addPart(AbstractComposite p) {
        return this.parts.add((ParcelPart) p);
    }

    @Override
    public boolean removePart(AbstractComposite p) {
        return parts.remove(p);
    }

    @Override
    public AbstractComposite child(BigInteger id) {
        return parts.stream().filter(p -> p.id().equals(id)).findAny().get();
    }

    @Override
    public List<AbstractComposite> allChild() {
        return new ArrayList<>(parts);
    }

}
