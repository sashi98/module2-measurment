package com.he.trainer.bootcamp;

import static com.he.trainer.bootcamp.MeasureType.TEMPERATURE;

public enum Unit {
    MILI_METER(1, MeasureType.LENGTH),
    CENTI_METER(10, MeasureType.LENGTH),
    METER(1000, MeasureType.LENGTH),
    KILO_METER(1000 * 1000, MeasureType.LENGTH),

    MILI_GRAM(1, MeasureType.WEIGHT),
    CENTI_GRAM(10, MeasureType.WEIGHT),
    GRAM(1000, MeasureType.WEIGHT),
    KILO_GRAM(1000 * 1000, MeasureType.WEIGHT),

    CELSIUS(1, (double) 9 / 5, 273.15, TEMPERATURE),
    FAHRENHEIT((double) 5 / 9, 1, (double) 5 / 9, TEMPERATURE),
    KELVIN(-273.15, (double) 9 / 5, 1, TEMPERATURE);

    private final double factor;
    private final double cFactor;
    private final double fFactor;
    private final double kFactor;

    private final MeasureType type;

    Unit(int factor, MeasureType type) {
        this.factor = factor;
        this.type = type;
        this.cFactor = 0;
        this.fFactor = 0;
        this.kFactor = 0;
    }

    Unit(double cFactor, double fFactor, double kFactor, MeasureType type) {
        this.cFactor = cFactor;
        this.fFactor = fFactor;
        this.kFactor = kFactor;
        this.type = type;
        this.factor = 0;
    }

    public double convertToBase(double qty) {
        if (this.type == TEMPERATURE) {
            if (this == FAHRENHEIT) {
                return (qty - 32) * cFactor;
            } else if (this == KELVIN) {
                return qty + cFactor;
            } else {
                return qty;
            }
        }
        return qty * this.factor;
    }

    public double convertFromBase(double qty) {
        if (this.type == TEMPERATURE) {
            if (this == FAHRENHEIT) {
                return qty * fFactor + 32;
            } else if (this == KELVIN) {
                return qty + kFactor;
            } else {
                return qty;
            }
        }
        return qty / this.factor;
    }

    public boolean isSameTypeOf(Unit unit) {
        return this.type == unit.type;
    }

    public boolean isTemperatureType() {
        return TEMPERATURE == this.type;
    }
}
