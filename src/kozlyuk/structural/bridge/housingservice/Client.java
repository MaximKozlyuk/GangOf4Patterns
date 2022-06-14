package kozlyuk.structural.bridge.housingservice;

import kozlyuk.structural.bridge.housingservice.report.HousingReport;
import kozlyuk.structural.bridge.housingservice.report.MonthReport;
import kozlyuk.structural.bridge.housingservice.report.WaterHousingReport;

import java.math.BigInteger;

public final class Client {

    private final BigInteger id = new BigInteger(String.valueOf(System.currentTimeMillis()));

    public void printMonthReport() {
        // genning client info by id and determining which device he has.
        HousingReport report = new WaterHousingReport();
        MonthReport monthReport = report.monthReport();
        System.out.println(monthReport.toString());
    }

}
