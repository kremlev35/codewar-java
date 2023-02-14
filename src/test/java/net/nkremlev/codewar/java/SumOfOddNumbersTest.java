package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.SumOfOddNumbers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfOddNumbersTest {

    @Test
    public void simple_test() {
        assertEquals(1, rowSumOddNumbers(1));
        assertEquals(74088, rowSumOddNumbers(42));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals(1, rowSumOddNumbersBest(1));
        assertEquals(74088, rowSumOddNumbersBest(42));
    }
}
