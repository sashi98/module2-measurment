package com.he.trainer.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.he.trainer.bootcamp.Measurement.*;

public class LengthTest {

    @Test
    public void _1000meters_equals_to_1000meters(){
        Measurement _1000meter1 = meter(1000);
        Measurement _1000meter2 = meter(1000);
        Assertions.assertEquals(_1000meter1, _1000meter2);
    }

    @Test
    public void _1meters_is_not_equal_to_2meters(){
        Measurement _1meter = meter(1);
        Measurement _2meter = meter(2);
        Assertions.assertNotEquals(_1meter, _2meter);
    }

    @Test
    public void _1000meters_equals_to_1kilometer(){
        Measurement _1000meter = meter(1000);
        Measurement _1kilometer = kilometer(1);
        Assertions.assertEquals(_1000meter, _1kilometer);
    }

    @Test
    public void _1kilometers_equals_to_1000meter(){
        Measurement _1000meter = meter(1000);
        Measurement _1kilometer = kilometer(1);
        Assertions.assertEquals(_1kilometer, _1000meter);
    }

    @Test
    public void _100cm_equals_to_1m(){
        Measurement _100cm = centimeter(100);
        Measurement _1meter = meter(1);
        Assertions.assertEquals(_100cm, _1meter);
    }

    @Test
    public void _10m_equals_to_1000cm(){
        Measurement _1000cm = centimeter(1000);
        Measurement _10meter = meter(10);
        Assertions.assertEquals(_10meter, _1000cm);
    }

    @Test
    public void _5km_equals_to_500000cm(){
        Measurement _500000cm = centimeter(500000);
        Measurement _5km = kilometer(5);
        Assertions.assertEquals(_5km, _500000cm);
    }

    @Test
    public void _200000cm_equals_to_2km(){
        Measurement _200000cm = centimeter(200000);
        Measurement _2km = kilometer(2);
        Assertions.assertEquals(_200000cm, _2km);
    }
}
