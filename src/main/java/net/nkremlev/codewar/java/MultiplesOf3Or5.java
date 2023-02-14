package net.nkremlev.codewar.java;

import java.util.stream.IntStream;

/**
 * @see <a href="https://www.codewars.com/kata/514b92a657cdc65150000006">Multiples of 3 or 5</a>
 *
 * @author nkremlev
 */
public final class MultiplesOf3Or5 {

    /**
     * Сумма чисел кратных 3 и 5 до заданного числа
     * @param number число
     * @return сумма чисел кратных 3 и 5
     */
    public static int solution(int number) {
        if (number <= 0)
            return 0;
        int result = 0;
        for (int num = 0; num < number; num++) {
            if (num % 3 == 0 || num % 5 == 0)
                result += num;
        }
        return result;
    }

    //Лучшее решение по мнению code-war
    public static int solutionBest(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
