package kozlyuk.structural.flyweight.lada;

import java.util.List;

public interface Vehicle {

    int cost(List<CalculationParameter> params);

    Model model();

    int horsePower();

    Color color();

    EquipmentGrade getEquipmentGrade();

    default String display() {
        return modelKey(model(), getEquipmentGrade(), color());
    }

    static String modelKey(Model model, EquipmentGrade grade, Color color) {
        return model.toString().toUpperCase()
                + grade.toString().toUpperCase()
                + color.R + color.G + color.B;
    }
}
