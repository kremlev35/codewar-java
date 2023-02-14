package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;
import java.util.List;

import static net.nkremlev.codewar.java.SortMyTextbooks.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortMyTextbooksTest {

    private static final List<String> EXPECTED_1 = List.of("Algebra", "English", "Geometry", "History");
    private static final List<String> EXPECTED_2 = List.of("Algebra", "english", "Geometry", "history");
    private static final List<String> EXPECTED_3 = List.of("$istory", "**English", "Alg#bra", "Geom^try");

    private static final List<String> ACTUAL_1 = List.of("Algebra", "History", "Geometry", "English");
    private static final List<String> ACTUAL_2 = List.of("Algebra", "history", "Geometry", "english");
    private static final List<String> ACTUAL_3 = List.of("Alg#bra", "$istory", "Geom^try", "**English");


    @Test
    public void simple_test() {
        assertEquals(EXPECTED_1, sort(ACTUAL_1));
    }

    @Test
    public void capitalization_test() {
        assertEquals(EXPECTED_2, sort(ACTUAL_2));
    }

    @Test
    public void symbols_test() {
        assertEquals(EXPECTED_3, sort(ACTUAL_3));
    }

    @Test
    public void simple_test_for_best() {
        assertEquals(EXPECTED_1, sortBest(ACTUAL_1));
    }

    @Test
    public void capitalization_test_for_best() {
        assertEquals(EXPECTED_2, sortBest(ACTUAL_2));
    }

    @Test
    public void symbols_test_for_best() {
        assertEquals(EXPECTED_3, sortBest(ACTUAL_3));
    }
}
