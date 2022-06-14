package kozlyuk.structural.bridge.housingservice.measuredevice;

import kozlyuk.structural.bridge.housingservice.MeasureUnit;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public final class Zeus220 implements MeasurementDevice {

    @Override
    public BigInteger deviceId() {
        return new BigInteger("220");
    }

    @Override
    public List<SingleMeasure> getMeasuresForLastDays(int days) {
        return getDummyMeasures(days, MeasureUnit.KWH);
    }

    @Override
    public List<SingleMeasure> getMeasuresFromTo(Date dateFrom, Date dateTo) {
        int days = dateTo.getDay() - dateFrom.getDay() + 5;
        return getDummyMeasures(days, MeasureUnit.KWH);
    }

    @Override
    public SingleMeasure lastMeasure() {
        return getDummyMeasures(1, MeasureUnit.KWH).get(0);
    }
}
