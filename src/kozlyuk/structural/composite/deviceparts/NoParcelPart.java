package kozlyuk.structural.composite.deviceparts;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Null equivalent for any subtype of {@link ParcelPart}
 */
public final class NoParcelPart implements ParcelPart {

    public static final ParcelPart instance = new NoParcelPart();

    private NoParcelPart(){}

    @Override
    public BigInteger id() {
        return BigInteger.ZERO;
    }

    @Override
    public boolean addPart(AbstractComposite p) {
        return false;
    }

    @Override
    public boolean removePart(AbstractComposite p) {
        return false;
    }

    @Override
    public AbstractComposite child(BigInteger id) {
        return this;
    }

    @Override
    public List<AbstractComposite> allChild() {
        return null;
    }

    @Override
    public String name() {
        return "No part";
    }

    @Override
    public String description() {
        return "No description";
    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public double allWeight() {
        return weight();
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public double allCost() {
        return cost();
    }

}
