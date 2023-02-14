package net.nkremlev.codewar.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://www.codewars.com/kata/55466989aeecab5aac00003e">Rectangle into Squares</a>
 *
 * @author nkremlev
 */
public final class RectangleIntoSquares {

    /**
     * Возвращает список сторон квадратов помещенных в заданный прямоугольник
     * @param lng длина прямоугольника
     * @param wdth ширина прямоугольника
     * @return список сторон возможных квадратов
     */
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        while (lng != 0 && wdth != 0) {
            if (lng > wdth) {
                lng -= wdth;
                result.add(wdth);
            } else {
                wdth -= lng;
                result.add(lng);
            }
        }
        return result;
    }

    //Лучшее решение по мнению code-war
    public static List<Integer> sqInRectBest(int lng, int wdth) {
        if (lng == wdth)
            return null;
        List<Integer> squares = new ArrayList<>();
        int area = lng * wdth;
        while (area > 0) {
            squares.add(Math.min(lng,wdth));
            if (wdth > lng)
                wdth = wdth - lng;
            else
                lng = lng - wdth;
            area = lng * wdth;
        }
        return squares;
    }
}
