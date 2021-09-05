package com.he.trainer.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static com.he.trainer.bootcamp.Measurement.*;

public class WeightTest {
    @Test
    public void _1000_grams_equals_1kilograms() {
        Assertions.assertEquals(gram(1000), kilogram(1));
    }

    @Test
    public void _1kilograms_not_equals_2kilograms() {
        Assertions.assertNotEquals(kilogram(1), kilogram(2));
    }

    @Test
    public void _2000000miligrams_equals_2kilograms() {
        Assertions.assertEquals(miligram(2000000), kilogram(2));
    }

    @Test
    public void _2kilograms_equals_2000000miligrams() {
        Assertions.assertEquals(kilogram(2),miligram(2000000));
    }

    @Test
    public void _1000grams_plus_1000grams_equals_2000grams() throws IncompatibleMeasurementTypeException {
        Assertions.assertEquals(gram(2000), gram(1000).add(gram(1000)));
    }

    @Test
    public void _1kilograms_plus_300grams_equals_1_point_3kilograms() throws IncompatibleMeasurementTypeException {
        Assertions.assertEquals(kilogram(1.3), kilogram(1).add(gram(300)));
    }

    @Test
    public void _500grams_plus_1kilograms_equals_1500grams() throws IncompatibleMeasurementTypeException {
        Assertions.assertEquals(gram(1500), gram(500).add(kilogram(1)));
    }

    @Test
    public void addition_of_length_and_weight_throws_exception(){
        Assertions.assertThrows(IncompatibleMeasurementTypeException.class, () -> meter(500).add(gram(500)));
    }
}
