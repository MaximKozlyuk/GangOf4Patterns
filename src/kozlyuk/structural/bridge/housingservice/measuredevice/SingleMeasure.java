package kozlyuk.structural.bridge.housingservice.measuredevice;

import kozlyuk.structural.bridge.housingservice.MeasureUnit;

import java.util.Date;

public final class SingleMeasure {

    private final MeasureUnit unit;
    private final double value;
    private final Date date;
    private SingleMeasure prevMeasure;

    public SingleMeasure(MeasureUnit unit, double value, Date date) {
        this.unit = unit;
        this.value = value;
        this.date = date;
    }

    public SingleMeasure(MeasureUnit unit, double value, Date date, SingleMeasure prevMeasure) {
        this.unit = unit;
        this.value = value;
        this.date = date;
        this.prevMeasure = prevMeasure;
    }

    public MeasureUnit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    public SingleMeasure getPrevMeasure() {
        return prevMeasure;
    }

    @Override
    public String toString() {
        return "Measure " + date.toString() + " " + value + " " + unit;
    }
}
