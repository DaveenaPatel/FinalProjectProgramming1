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
}
