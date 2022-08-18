package net.kremlev.codewar.java;

import net.kremlev.codewar.java.task.FindThePartyOutlier;

import static net.kremlev.codewar.java.util.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
        testFindTheParityOutlier();
    }

    private static void testFindTheParityOutlier() {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0 ,1};
        assertEquals(3, FindThePartyOutlier.find(exampleTest1));
        assertEquals(206847684, FindThePartyOutlier.find(exampleTest2));
        assertEquals(0, FindThePartyOutlier.find(exampleTest3));
    }
}
