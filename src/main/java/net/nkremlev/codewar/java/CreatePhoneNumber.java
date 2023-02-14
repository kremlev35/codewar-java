package net.nkremlev.codewar.java;

/**
 * @see <a href="https://www.codewars.com/kata/525f50e3b73515a6db000b83">Create Phone Number</a>
 *
 * @author nkremlev
 */
public final class CreatePhoneNumber {

    /**
     * Возвращает номер телефона из заданного массива чисел
     * @param numbers массив чисел номера телефона
     * @return строковый варинат номера телефона
     */
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int number : numbers) {
            stringBuilder.append(number);
        }
        String numbersString = stringBuilder.toString();
        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("(");
        stringBuilder.append(numbersString, 0, 3);
        stringBuilder.append(") ");
        stringBuilder.append(numbersString, 3, 6);
        stringBuilder.append("-");
        stringBuilder.append(numbersString, 6, 10);
        return stringBuilder.toString();
    }

    //Лучшее решение по мнению code-war
    public static String createPhoneNumberBest(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0],
                numbers[1],
                numbers[2],
                numbers[3],
                numbers[4],
                numbers[5],
                numbers[6],
                numbers[7],
                numbers[8],
                numbers[9]
        );
    }
}
