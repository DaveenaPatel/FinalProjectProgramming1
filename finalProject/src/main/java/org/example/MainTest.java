package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testIsPostalCodeValid() {
        String postalCode = "123 456";
        boolean expectedResult = true;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testCalcAssignment() {
        int numerator = 8;
        int denominator = 10;
        int expectedResult = 80;
        int result = Assignment.calcAssignment(numerator, denominator);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testCalcAssignment2() {
        int numerator = 35;
        int denominator = 40;
        int expectedResult = 87;
        int result = Assignment.calcAssignment(numerator, denominator);
        Assertions.assertEquals(expectedResult, result);
    }
}
