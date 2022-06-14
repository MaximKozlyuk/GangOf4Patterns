package kozlyuk.structural.bridge.housingservice.report;

import kozlyuk.structural.bridge.housingservice.measuredevice.MeasurementDevice;
import kozlyuk.structural.bridge.housingservice.measuredevice.SingleMeasure;

import java.util.Date;
import java.util.List;

public class GeneralHousingReport implements HousingReport {

    private final static double smartTariff = 0.6437486587;
    protected final MeasurementDevice device;

    public GeneralHousingReport(MeasurementDevice device) {
        this.device = device;
    }

    @Override
    public double debt() {
        Date latestNoDebtDay = lastPayedDate();
        List<SingleMeasure> measures = device.getMeasuresFromTo(latestNoDebtDay, new Date());
        // debt calculation based on some tariff.
        return measures.stream().mapToDouble(SingleMeasure::getValue).sum() * smartTariff;
    }

    @Override
    public double spendsFromDate(Date date) {
        return 123;
    }

    @Override
    public MonthReport monthReport() {
        return new MonthReport(device.getMeasuresForLastDays(30), debt());
    }

    // determining latest date where debt was 0
    private Date lastPayedDate() {
        Date today = new Date();
        return new Date(today.getYear() - 1, today.getMonth(), today.getDay());
    }
}
