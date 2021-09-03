package com.he.trainer.bootcamp;

public enum Unit {
    MILI_METER(1, MeasureType.LENGTH),
    CENTI_METER(10, MeasureType.LENGTH),
    METER(1000, MeasureType.LENGTH),
    KILO_METER(1000 * 1000, MeasureType.LENGTH);

    private final int factor;
    private final MeasureType type;

    Unit(int factor, MeasureType type) {
        this.factor = factor;
        this.type = type;
    }

    public int convertToBase(int qty) {
        return this.factor * qty;
    }

    public boolean isSameTypeOf(Unit unit){
        return this.type == unit.type;
    }
}
