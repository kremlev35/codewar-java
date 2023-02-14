package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static net.nkremlev.codewar.java.RectangleIntoSquares.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RectangleIntoSquaresTest {

    @Test
    public void simple_test() {
        assertEquals(Arrays.asList(3, 2, 1, 1), sqInRect(5, 3));
    }

    @Test
    public void test_of_length_and_width_equals() {
        assertNull(sqInRect(5, 5));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals(Arrays.asList(3, 2, 1, 1), sqInRectBest(5, 3));
    }

    @Test
    public void test_of_length_and_width_equals_for_best() {
        assertNull(sqInRectBest(5, 5));
    }
}
