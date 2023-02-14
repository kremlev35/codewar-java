package net.nkremlev.codewar.java;

import static java.lang.Math.abs;

/**
 * @see <a href="https://www.codewars.com/kata/55685cd7ad70877c23000102">Return Negative</a>
 *
 * @author  nkremlev
 */
public final class ReturnNegative {

    /**
     * Преобразует число в отрицательное
     * @param x число
     * @return отрицательное число
     */
    public static int makeNegative(final int x) {
        return x <= 0 ? x : -x;
    }

    //Лучшее решение по мнению code-war
    public static int makeNegativeBest(final int x) {
        return -abs(x);
    }
}
