package net.nkremlev.codewar.java;

import java.util.Arrays;

/**
 * @see <a href="https://www.codewars.com/kata/5526fc09a1bbd946250002dc">Find The Parity Outlier</a>
 *
 * @author nkremlev
 */
public final class FindThePartyOutlier {

    /**
     * Принимает массив натуральных целых чисел четных/нечетных и находит лишнее число нечетное/четное и возвращает его
     * @param integers массив целых чисел
     * @return четное/нечетное число в массиве нечетных/четных чисел
     */
    public static int find(int[] integers) {
        int[] oddIntegers = Arrays.stream(integers).filter(num -> num % 2 != 0).toArray();
        int[] evenIntegers = Arrays.stream(integers).filter(num -> num % 2 == 0).toArray();
        return oddIntegers.length > evenIntegers.length ? evenIntegers[0] : oddIntegers[0];
    }

    //Лучшее решение по мнению code-war
    public static int findBest(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
