package kozlyuk.structural.flyweight.lada;

public class UnSharedLadaFlyweight extends LadaFlyweight {

    public UnSharedLadaFlyweight(int power, Model model, Color color, EquipmentGrade equipmentGrade) {
        super(power, model, color, equipmentGrade);
    }

    public void setColor(Model model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setEquipmentGrade(EquipmentGrade grade) {
        this.equipmentGrade = grade;
    }

}
