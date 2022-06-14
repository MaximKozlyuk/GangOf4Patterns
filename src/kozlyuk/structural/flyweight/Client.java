package kozlyuk.structural.flyweight;

import kozlyuk.structural.flyweight.lada.Color;
import kozlyuk.structural.flyweight.lada.EquipmentGrade;
import kozlyuk.structural.flyweight.lada.FlyweightLadaFactory;
import kozlyuk.structural.flyweight.lada.Model;

import java.util.List;
import java.util.Random;

public class Client {

    private static final Random RAND = new Random(System.currentTimeMillis());

    public void flyWeightExample() {
        var vehiclesAmount = 100000;
        final var models = List.of(Model.values());
        final var colors = List.of(Color.values());
        final var eqGrades = List.of(EquipmentGrade.values());

        for (int i = 0; i < vehiclesAmount; i++) {
            var v = FlyweightLadaFactory.createVehicle(
                    models.get(RAND.nextInt(models.size())),
                    eqGrades.get(RAND.nextInt(eqGrades.size())),
                    colors.get(RAND.nextInt(colors.size()))
            );
            System.out.println(v.display());
        }
    }

}
