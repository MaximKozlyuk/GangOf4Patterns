package kozlyuk.structural.bridge.housingservice.report;

import java.util.Date;

// General interface for any housing spends category. Returning values of local currency.
public interface HousingReport {

    double debt ();

    // amount of spends starting from arbitrary date.
    double spendsFromDate (Date date);

    MonthReport monthReport ();

}
