package kozlyuk.structural.flyweight.lada;

import java.util.List;
class LadaFlyweight implements Vehicle {

    protected Model model;
    protected Color color;
    protected EquipmentGrade equipmentGrade;
    protected int power;

    LadaFlyweight(int power, Model model, Color color, EquipmentGrade equipmentGrade) {
        this.model = model;
        this.color = color;
        this.equipmentGrade = equipmentGrade;
        this.power = power;
    }

    @Override
    public int cost(List<CalculationParameter> params) {
        var baseCost = model.hashCode() * color.hashCode() * equipmentGrade.hashCode() * (power / 10);
        var paramsProduct = params.stream().mapToDouble(CalculationParameter::value)
                .reduce(1, (a,b) -> a * b);
        return (int)(baseCost * paramsProduct);
    }

    @Override
    public Model model() {
        return model;
    }

    @Override
    public int horsePower() {
        return power;
    }

    @Override
    public Color color() {
        return color;
    }

    @Override
    public EquipmentGrade getEquipmentGrade() {
        return equipmentGrade;
    }
}
