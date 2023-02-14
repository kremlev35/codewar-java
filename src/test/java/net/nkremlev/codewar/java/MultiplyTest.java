package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.Multiply.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    @Test
    public void simple_test() {
        assertEquals(5.0, multiply(2.0, 2.5));
    }
}
