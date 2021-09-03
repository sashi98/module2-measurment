package com.he.trainer.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.he.trainer.bootcamp.Measurement.*;

public class LengthTest {

    @Test
    public void _1000meters_equals_to_1000meters(){
        Measurement _1000meter1 = newMeter(1000);
        Measurement _1000meter2 = newMeter(1000);
        Assertions.assertEquals(_1000meter1, _1000meter2);
    }

    @Test
    public void _1meters_is_not_equal_to_2meters(){
        Measurement _1meter = newMeter(1);
        Measurement _2meter = newMeter(2);
        Assertions.assertNotEquals(_1meter, _2meter);
    }

    @Test
    public void _1000meters_equals_to_1kilometer(){
        Measurement _1000meter = newMeter(1000);
        Measurement _1kilometer = newKilometer(1);
        Assertions.assertEquals(_1000meter, _1kilometer);
    }

    @Test
    public void _1kilometers_equals_to_1000meter(){
        Measurement _1000meter = newMeter(1000);
        Measurement _1kilometer = newKilometer(1);
        Assertions.assertEquals(_1kilometer, _1000meter);
    }

    @Test
    public void _100cm_equals_to_1m(){
        Measurement _100cm = newCentimeter(100);
        Measurement _1meter = newMeter(1);
        Assertions.assertEquals(_100cm, _1meter);
    }

    @Test
    public void _10m_equals_to_1000cm(){
        Measurement _1000cm = newCentimeter(1000);
        Measurement _10meter = newMeter(10);
        Assertions.assertEquals(_10meter, _1000cm);
    }

    @Test
    public void _5km_equals_to_500000cm(){
        Measurement _500000cm = newCentimeter(500000);
        Measurement _5km = newKilometer(5);
        Assertions.assertEquals(_5km, _500000cm);
    }

    @Test
    public void _200000cm_equals_to_2km(){
        Measurement _200000cm = newCentimeter(200000);
        Measurement _2km = newKilometer(2);
        Assertions.assertEquals(_200000cm, _2km);
    }
}
