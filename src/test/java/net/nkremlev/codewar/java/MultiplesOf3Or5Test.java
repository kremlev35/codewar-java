package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.MultiplesOf3Or5.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesOf3Or5Test {

    @Test
    public void simple_test() {
        assertEquals(23, solution(10));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals(23, solutionBest(10));
    }
}
