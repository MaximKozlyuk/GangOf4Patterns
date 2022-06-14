package kozlyuk.structural.composite.deviceparts;

import java.math.BigInteger;
import java.util.List;

/**
 * Terminal parcel part which cant contain other parts.
 */
public class LeafParcelPart extends DefaultParcelPart {

    public LeafParcelPart(BigInteger id, ParcelProperties properties) {
        super(id, properties);
    }

    @Override
    public double weight() {
        return super.weight();
    }

    @Override
    public final double allWeight() {
        return super.allWeight();
    }

    @Override
    public double cost() {
        return super.cost();
    }

    @Override
    public final double allCost() {
        return super.allCost();
    }

    @Override
    final public boolean addPart(AbstractComposite p) {
        return false;
    }

    @Override
    final public boolean removePart(AbstractComposite p) {
        return false;
    }

    @Override
    final public AbstractComposite child(BigInteger id) {
        return NoParcelPart.instance;
    }

    @Override
    final public List<AbstractComposite> allChild() {
        return List.of(child(BigInteger.ZERO));
    }
}
