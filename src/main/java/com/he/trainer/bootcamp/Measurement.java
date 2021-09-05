package com.he.trainer.bootcamp;

import java.util.Objects;

public class Measurement {
    private final int qty;
    private final Unit unit;

    public Measurement(int qty, Unit unit) {
        this.qty = qty;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement that = (Measurement) o;
        if (this.unit.isSameTypeOf(that.unit)) {
            return this.unit.convertToBase(this.qty) == that.unit.convertToBase(that.qty);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(qty, unit);
    }

    public static Measurement centimeter(int qty) {
        return new Measurement(qty, Unit.CENTI_METER);
    }

    public static Measurement meter(int qty) {
        return new Measurement(qty, Unit.METER);
    }

    public static Measurement kilometer(int qty) {
        return new Measurement(qty, Unit.KILO_METER);
    }
}
