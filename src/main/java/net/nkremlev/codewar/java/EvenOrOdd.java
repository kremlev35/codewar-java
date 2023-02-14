package net.nkremlev.codewar.java;

/**
 * @see <a href="https://www.codewars.com/kata/53da3dbb4a5168369a0000fe">Even or Odd</a>
 *
 * @author nkremlev
 */
public final class EvenOrOdd {

    /**
     * Является ли число четным или нечетным
     * @param number число
     * @return Even - если четное, Odd если не четное
     */
    public static String evenOrOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
