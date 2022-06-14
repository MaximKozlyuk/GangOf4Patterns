package kozlyuk.structural.bridge.housingservice.report;

import kozlyuk.structural.bridge.housingservice.measuredevice.MeasurementDevice;
import kozlyuk.structural.bridge.housingservice.measuredevice.Vodichka3000;
import kozlyuk.structural.bridge.housingservice.measuredevice.Vodoley2;

public class WaterHousingReport extends GeneralHousingReport implements HousingReport {

    private final MeasurementDevice hotWater;

    public WaterHousingReport() {
        super(new Vodichka3000());
        this.hotWater = new Vodoley2();
    }

    public double waterDebt () {
        return super.debt() + hotWater.lastMeasure().getValue() * 100;
    }

}
