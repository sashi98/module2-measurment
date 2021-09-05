package com.he.trainer.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.he.trainer.bootcamp.Measurement.*;

public class TemperatureTest {

    @Test
    public void _0celsius_equals_32fahrenheit() {
        Assertions.assertEquals(celsius(0), fahrenheit(32));
    }

    @Test
    public void _0celsius_not_equals_1fahrenheit() {
        Assertions.assertNotEquals(celsius(0), fahrenheit(1));
    }

    @Test
    public void _0celsius_equals_273kelvin() {
        Assertions.assertEquals(celsius(0), kelvin(273.15));
    }

    @Test
    public void _273kelvin_equals_0celsius() {
        Assertions.assertEquals(kelvin(273.15), celsius(0));
    }

    @Test
    public void _0fahrenheit_equals_255kelvin() {
        Assertions.assertEquals(fahrenheit(0), kelvin(255.372));
    }

    @Test
    public void _2fahrenheit_equals_255kelvin() {
        Assertions.assertEquals(fahrenheit(2), kelvin(256.483));
    }

    @Test
    public void temperature_addition_throws_exception() {
        Assertions.assertThrows(IllegalOperationException.class, () -> celsius(2).add(celsius(500)));
    }
}
