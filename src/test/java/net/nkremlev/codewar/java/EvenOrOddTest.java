package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.EvenOrOdd.evenOrOdd;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    public void simple_test() {
        assertEquals("Even", evenOrOdd(6));
        assertEquals("Odd", evenOrOdd(7));
        assertEquals("Even", evenOrOdd(0));
        assertEquals("Odd", evenOrOdd(-1));
    }
}
