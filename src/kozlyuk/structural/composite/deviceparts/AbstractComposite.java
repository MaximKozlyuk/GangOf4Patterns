package kozlyuk.structural.composite.deviceparts;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface AbstractComposite extends Iterable<AbstractComposite> {

    BigInteger id();

    boolean addPart(AbstractComposite p);
    boolean removePart(AbstractComposite p);

    AbstractComposite child(BigInteger id);
    List<? extends AbstractComposite> allChild();

    @Override
    default Iterator<AbstractComposite> iterator() {
        return (Iterator<AbstractComposite>) allChild().iterator();
    }

    @Override
    default void forEach(Consumer<? super AbstractComposite> action) {
        allChild().forEach(action);
    }

    @Override
    default Spliterator<AbstractComposite> spliterator() {
        return (Spliterator<AbstractComposite>) allChild().spliterator();
    }

}
