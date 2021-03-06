package com.he.trainer.bootcamp;

import java.util.Objects;

public class Measurement {
    private final double qty;
    private final Unit unit;

    public Measurement(double qty, Unit unit) {
        this.qty = qty;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement that = (Measurement) o;
        if (this.unit.isSameTypeOf(that.unit)) {
            return Math.round(this.unit.convertToBase(this.qty)) == Math.round(that.unit.convertToBase(that.qty));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.unit.convertToBase(this.qty));
    }

    public static Measurement centimeter(int qty) {
        return new Measurement(qty, Unit.CENTI_METER);
    }

    public static Measurement miligram(double qty) {
        return new Measurement(qty, Unit.MILI_GRAM);
    }

    public static Measurement meter(int qty) {
        return new Measurement(qty, Unit.METER);
    }

    public static Measurement kilometer(double qty) {
        return new Measurement(qty, Unit.KILO_METER);
    }

    public static Measurement gram(double qty) {
        return new Measurement(qty, Unit.GRAM);
    }

    public static Measurement kilogram(double qty) {
        return new Measurement(qty, Unit.KILO_GRAM);
    }

    public static Measurement fahrenheit(double qty) {
        return new Measurement(qty, Unit.FAHRENHEIT);
    }

    public static Measurement celsius(double qty) {
        return new Measurement(qty, Unit.CELSIUS);
    }

    public static Measurement kelvin(double qty) {
        return new Measurement(qty, Unit.KELVIN);
    }

    public Measurement add(Measurement that) throws IncompatibleMeasurementTypeException, IllegalOperationException {
        if (!this.unit.isSameTypeOf(that.unit)) throw new IncompatibleMeasurementTypeException();
        if (this.unit.isTemperatureType()) throw new IllegalOperationException();
        return new Measurement(this.unit.convertFromBase(this.unit.convertToBase(this.qty) + that.unit.convertToBase(that.qty)), this.unit);
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "qty=" + qty +
                ", unit=" + unit +
                '}';
    }
}
