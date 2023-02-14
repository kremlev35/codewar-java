package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.DuplicateEncoder.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEncoderTest {

    private static final String EXPECTED_1 = ")()())()(()()(";
    private static final String EXPECTED_2 = "))))())))";
    private static final String TEST_WORD_1 = "Prespecialized";
    private static final String TEST_WORD_2 = "   ()(   ";

    @Test
    public void simple_test() {
        assertEquals(EXPECTED_1, encode(TEST_WORD_1));
        assertEquals(EXPECTED_2, encode(TEST_WORD_2));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals(EXPECTED_1, encoderBest(TEST_WORD_1));
        assertEquals(EXPECTED_2, encoderBest(TEST_WORD_2));
    }
}
