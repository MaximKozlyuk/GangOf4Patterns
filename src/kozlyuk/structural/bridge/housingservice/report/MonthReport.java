package kozlyuk.structural.bridge.housingservice.report;

import kozlyuk.structural.bridge.housingservice.measuredevice.SingleMeasure;

import java.util.List;

public final class MonthReport {

    private final List<SingleMeasure> measures;
    private final double debt;

    public MonthReport(List<SingleMeasure> measures, double debt) {
        this.measures = measures;
        this.debt = debt;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Debt = " + debt);
        measures.forEach(m -> str.append(m.toString()));
        return str.toString();
    }
}
