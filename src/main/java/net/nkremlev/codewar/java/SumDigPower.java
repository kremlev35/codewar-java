package net.nkremlev.codewar.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @see <a href="https://www.codewars.com/kata/5626b561280a42ecc50000d1">Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!</a>
 *
 * @author nkremlev
 */
public final class SumDigPower {

    /**
     * Числа входящие по следующему смыслу:
     * 89 = 8^1 + 9^2, 135 = 1^1 + 3^2 + 5^3;
     * @param a начало диапазона
     * @param b конец диапазона
     * @return список удовлетворяющих чисел
     */
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            if (i < 10) {
                result.add(i);
            } else {
                if (i == getValidNumber(i)) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private static long getValidNumber(long number) {
        long sumNumber = 0L;
        List<Long> numbers = getNumberList(number);
        for (int i = 1; i <= numbers.size(); i++) {
            sumNumber += Math.pow(numbers.get(i - 1), i);
        }
        return sumNumber;
    }

    private static List<Long> getNumberList(long number) {
        List<Long> numbers = new ArrayList<>();
        String numberString = Long.toString(number);
        String[] numbersString = numberString.split("");
        for (String element : numbersString) {
            numbers.add(Long.parseLong(element));
        }
        return numbers;
    }

    //Лучшее решение по мнению code-war
    public static List<Long> sumDigPowBest(long a, long b) {
        return LongStream.rangeClosed(a, b)
                .filter(i -> isValid(i))
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isValid(long x){
        String value = Long.toString(x);
        return IntStream.range(0, value.length())
                .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
                .sum() == x;
    }
}