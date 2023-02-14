package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.OppositeNumber.opposite;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeNumberTest {

    @Test
    public void simple_test() {
        assertEquals(-5, opposite(5));
    }
}
