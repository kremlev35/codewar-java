package net.nkremlev.codewar.java;

/**
 * @see <a href="https://www.codewars.com/kata/52c31f8e6605bcc646000082">Two Sum</a>
 *
 * @author nkremlev
 */
public final class TwoSum {

    /**
     * Получаем позицию чисел в массиве, сумма которых равна искомому
     * @param numbers массив чисел
     * @param target искомое число
     * @return пара индексов, сумма значений которых равна искомой
     */
    public static int[] twoSum(int[] numbers, int target) {
        for (int x = 0; x < numbers.length; x ++) {
            for (int y = x + 1; y < numbers.length; y++) {
                var num1 = numbers[x];
                var num2 = numbers[y];
                if (num1 + num2 == target) {
                    return new int[] {x, y};
                }
            }
        }
        throw new RuntimeException("Doesn't have pair");
    }

    //Лучшее решение по мнению code-war
    public static int[] twoSumBest(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
