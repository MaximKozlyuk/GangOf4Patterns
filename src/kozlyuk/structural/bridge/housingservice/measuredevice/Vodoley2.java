package kozlyuk.structural.bridge.housingservice.measuredevice;

import kozlyuk.structural.bridge.housingservice.MeasureUnit;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public final class Vodoley2 implements MeasurementDevice {

    @Override
    public BigInteger deviceId() {
        return new BigInteger("20054375");
    }

    @Override
    public List<SingleMeasure> getMeasuresForLastDays(int days) {
        return getDummyMeasures(days, MeasureUnit.CUBIK_LITER);
    }

    @Override
    public List<SingleMeasure> getMeasuresFromTo(Date dateFrom, Date dateTo) {
        int days = dateTo.getDay() - dateFrom.getDay() + 3;
        return getDummyMeasures(days, MeasureUnit.CUBIK_LITER);
    }

    @Override
    public SingleMeasure lastMeasure() {
        return new SingleMeasure(MeasureUnit.CUBIK_LITER, 10, new Date());
    }
}
