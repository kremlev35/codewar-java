package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.SquareDigit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareDigitTest {

    @Test
    public void simple_test() {
        assertEquals(811181, squareDigits(9119));
        assertEquals(0, squareDigits(0));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals(811181, squareDigitsBest(9119));
        assertEquals(0, squareDigitsBest(0));
    }
}
