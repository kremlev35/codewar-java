package net.nkremlev.codewar.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirclesInPolygonsTest {

    private static final CirclesInPolygons POLYGONS_1 = new CirclesInPolygons(4, 5);
    private static final CirclesInPolygons POLYGONS_2 = new CirclesInPolygons(8, 9);
    private static final CirclesInPolygons POLYGONS_3 = new CirclesInPolygons(3, 4);

    @Test
    public void simple_test_1() {
        assertEquals("5,000", String.format("%.3f", POLYGONS_1.circleDiameter()));
    }

    @Test
    public void simple_test_2() {
        assertEquals("21,728", String.format("%.3f", POLYGONS_2.circleDiameter()));
    }

    @Test
    public void simple_test_3() {
        assertEquals("2,309", String.format("%.3f", POLYGONS_3.circleDiameter()));
    }

    @Test
    public void simple_test_1_for_best() {
        assertEquals("5,000", String.format("%.3f", POLYGONS_1.circleDiameterBest()));
    }

    @Test
    public void simple_test_2_for_best() {
        assertEquals("21,728", String.format("%.3f", POLYGONS_2.circleDiameterBest()));
    }

    @Test
    public void simple_test_3_for_best() {
        assertEquals("2,309", String.format("%.3f", POLYGONS_3.circleDiameterBest()));
    }
}
