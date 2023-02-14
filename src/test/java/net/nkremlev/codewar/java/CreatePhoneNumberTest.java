package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.CreatePhoneNumber.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatePhoneNumberTest {

    @Test
    public void simple_test() {
        assertEquals("(123) 456-7890", createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals("(123) 456-7890", createPhoneNumberBest(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
