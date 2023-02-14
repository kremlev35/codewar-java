package net.nkremlev.codewar.java;

/**
 * @see <a href="https://www.codewars.com/kata/5a026a9cffe75fbace00007f">Circles in Polygons</a>
 *
 * @author nkremlev
 */
public final class CirclesInPolygons {
    private int sides;
    private int sideLength;

    public CirclesInPolygons(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        return (sideLength / (2 * Math.tan(Math.toRadians(180d / sides)))) * 2;
    }

    //Лучшее решение по мнению code-war
    public double circleDiameterBest() {
        return sideLength / Math.tan(Math.toRadians(180d / sides));
    }
}
