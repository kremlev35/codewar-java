package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.ReturnNegative.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnNegativeTest {

    @Test
    public void simple_test() {
        assertEquals(-42, makeNegative(42));
        assertEquals(-42, makeNegativeBest(42));
    }

    @Test
    public void test_negative_number() {
        assertEquals(-5, makeNegative(-5));
        assertEquals(-5, makeNegativeBest(-5));
    }
}
