package kozlyuk.structural.composite;

import kozlyuk.structural.composite.deviceparts.DefaultParcelPart;
import kozlyuk.structural.composite.deviceparts.LeafParcelPart;
import kozlyuk.structural.composite.deviceparts.ParcelProperties;

import java.math.BigInteger;

final public class Client {

    public void compositeExample() {
        DefaultParcelPart box = new DefaultParcelPart(
                    new BigInteger("1"),
                    new ParcelProperties("OuterBox", "cardboard", 0.1, 100)
                );
        DefaultParcelPart pc = new DefaultParcelPart(
                new BigInteger("2"),
                new ParcelProperties("Super PC 3000", "your wish", 10, 100500)
        );
        pc.addPart(
                new LeafParcelPart(
                        new BigInteger("3"),
                        new ParcelProperties("SSD 1024", "durable", 0.125, 10000)
                )
        );
        pc.addPart(
                new LeafParcelPart(
                        new BigInteger("4"),
                        new ParcelProperties("Cooling fan 120mm", "silent", 0.2, 700)
                )
        );
        box.addPart(pc);

        LeafParcelPart monitor = new LeafParcelPart(
                new BigInteger("3"),
                new ParcelProperties("Retina Monitor", "120hz", 5, 40000)
        );
        box.addPart(monitor);

        System.out.println("Costs:");
        System.out.println(box.cost());
        System.out.println(box.allCost());
        System.out.println("Weights:");
        System.out.println(box.weight());
        System.out.println(box.allWeight());

        box.removePart(monitor);
        System.out.println("Remove monitor:");
        System.out.println(box.allCost());
    }

}
