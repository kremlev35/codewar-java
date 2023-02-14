package net.nkremlev.codewar.java;

/**
 * @see <a href="https://www.codewars.com/kata/55fd2d567d94ac3bc9000064">Sum of odd numbers</a>
 *
 * @author nkremlev
 */
public final class SumOfOddNumbers {

    /**
     * Получить сумму n строку треугольника
     * @param n строка треугольника
     * @return сумма чисел в строке треугольника
     */
    public static int rowSumOddNumbers(int n) {
        var numCheck = n <= 0 ? 1 : n;
        return (int) Math.pow(numCheck, 3.0);
    }

    //Лучшее решение по мнению code-war
    public static int rowSumOddNumbersBest(int n) {
        return n * n * n;
    }
}
