package com.mohyla;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleJUnitTest {
    @Test
    void weightDifferenceTest() {
        double weight1 = 85.5;
        double weight2 = 78.2;
        Assumptions.assumeTrue(weight1 <= 100 && weight2 <= 100, "Assumption failed: one of the weight parameters is greater than 100 kg");
        assertTrue(Math.abs(weight1 - weight2) <= 15, "Weight difference is bigger than 15 kg");
    }
}
