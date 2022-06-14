package kozlyuk.structural.bridge.housingservice.measuredevice;

import kozlyuk.structural.bridge.housingservice.MeasureUnit;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface MeasurementDevice {

    /**
     * @return id of device, bounded with device owner.
     */
    BigInteger deviceId();

    List<SingleMeasure> getMeasuresForLastDays(int days);

    List<SingleMeasure> getMeasuresFromTo(Date dateFrom, Date dateTo);

    SingleMeasure lastMeasure();

    default List<SingleMeasure> getDummyMeasures (int days, MeasureUnit unit) {
        List<SingleMeasure> result = new ArrayList<>(days);
        SecureRandom rand = new SecureRandom(); // not far from reality
        for (int i = 0; i < days; i++) {
            result.add(new SingleMeasure(unit, rand.nextInt(100), new Date()));
        }
        return result;
    }

}
