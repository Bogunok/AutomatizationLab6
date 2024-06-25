package com.mohyla;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 5, 8, 13})
    void addition(int a, int b, int result) {
        assertEquals(result, a + b, () -> a + " + " + b + " should equal " + result);
    }
}
