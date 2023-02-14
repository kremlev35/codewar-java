package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static net.nkremlev.codewar.java.SumDigPower.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigPowerTest {

    @Test
    public void simple_test() {
        assertEquals(List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L), sumDigPow(1, 10));
        assertEquals(List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L), sumDigPow(1, 100));
        assertEquals(List.of(89L), sumDigPow(10, 100));
        assertEquals(Collections.emptyList(), sumDigPow(90, 100));
        assertEquals(List.of(135L), sumDigPow(90, 150));
        assertEquals(List.of(89L, 135L), sumDigPow(50, 150));
        assertEquals(List.of(89L, 135L), sumDigPow(10, 150));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals(List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L), sumDigPowBest(1L, 10L));
        assertEquals(List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L), sumDigPowBest(1, 100));
        assertEquals(List.of(89L), sumDigPowBest(10, 100));
        assertEquals(Collections.emptyList(), sumDigPowBest(90, 100));
        assertEquals(List.of(135L), sumDigPowBest(90, 150));
        assertEquals(List.of(89L, 135L), sumDigPowBest(50, 150));
        assertEquals(List.of(89L, 135L), sumDigPowBest(10, 150));
    }
}
