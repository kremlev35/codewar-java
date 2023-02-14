package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static net.nkremlev.codewar.java.FindThePartyOutlier.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindThePartyOutlierTest {

    @Test
    public void simple_test() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, find(exampleTest1));
        assertEquals(206847684, find(exampleTest2));
        assertEquals(0, find(exampleTest3));
    }

    @Test
    public void simple_test_for_best() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, findBest(exampleTest1));
        assertEquals(206847684, findBest(exampleTest2));
        assertEquals(0, findBest(exampleTest3));
    }
}
