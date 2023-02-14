package net.nkremlev.codewar.java;

import java.util.stream.Collectors;

/**
 * @see <a href="https://www.codewars.com/kata/546e2562b03326a88e000020">Digit*Digit</a>
 *
 * @author nkremlev
 */
public final class SquareDigit {

    /**
     * Возводит каждую цифру в числе в квадрат
     * @param n число
     * @return новое число с возведенной цифрой в квадрате
     */
    public static int squareDigits(int n) {
        StringBuilder resultStr = new StringBuilder();
        String number = String.valueOf(n);
        String[] numbers = number.split("");
        for (String ch : numbers) {
            int i = Integer.parseInt(ch);
            resultStr.append(i * i);
        }
        return Integer.parseInt(resultStr.toString());
    }

    //Лучшее решение по мнению code-war
    public static int squareDigitsBest(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
