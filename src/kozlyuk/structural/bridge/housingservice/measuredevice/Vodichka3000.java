package kozlyuk.structural.bridge.housingservice.measuredevice;

import kozlyuk.structural.bridge.housingservice.MeasureUnit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Vodichka3000 implements MeasurementDevice {

    @Override
    public BigInteger deviceId() {
        return new BigInteger("100500");
    }

    @Override
    public List<SingleMeasure> getMeasuresForLastDays(int days) {
        List<SingleMeasure> result = new ArrayList<>(days);
        for (int i = 0; i < days; i++) {
            result.add(new SingleMeasure(
                    MeasureUnit.CUBIK_LITER, 100, new Date(System.currentTimeMillis() - (i * 86400000L)))
            );
        }
        return result;
    }

    @Override
    public List<SingleMeasure> getMeasuresFromTo(Date dateFrom, Date dateTo) {
        List<SingleMeasure> result = new ArrayList<>();
        int daysAmount = dateTo.getDay() - dateFrom.getDay();
        for (int i = 0; i < daysAmount; i++) {
            result.add(new SingleMeasure(
                    MeasureUnit.CUBIK_LITER, 250, new Date())
            );
        }
        return result;
    }

    @Override
    public SingleMeasure lastMeasure() {
        return new SingleMeasure(MeasureUnit.CUBIK_LITER, 250, new Date());
    }

}
