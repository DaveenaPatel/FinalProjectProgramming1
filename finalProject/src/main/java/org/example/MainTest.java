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

    @Test
    public void testIsAssignmentWeightValid() {
        double weight = 1;
        boolean expectedResult = true;
        boolean result = Course.isAssignmentValid(weight);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentWeightValid2() {
        double weight = 4;
        boolean expectedResult = false;
        boolean result = Course.isAssignmentValid(weight);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testToTitleCase() {
        String strIn = "daveena patel";
        String expectedResult = "Daveena Patel";
        String result = Util.toTitleCase(strIn);
        Assertions.assertEquals(expectedResult, result);
    }
}
