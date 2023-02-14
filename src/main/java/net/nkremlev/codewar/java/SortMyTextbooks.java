package net.nkremlev.codewar.java;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @see <a href="https://www.codewars.com/kata/5a07e5b7ffe75fd049000051">Sort My Textbooks</a>
 *
 * @author nkremlev
 */
public final class SortMyTextbooks {

    /**
     * Сортирует список учебников
     * @param textbooks список учебников
     * @return отсортированный список учебников
     */
    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream()
                .sorted(Comparator.comparing(str -> toLowerCaseChar(str.charAt(0))))
                .collect(toList());
    }

    private static char toLowerCaseChar(char ch) {
        String str = "" + ch;
        return str.toLowerCase().charAt(0);
    }

    //Лучшее решение по мнению code-war
    public static List<String> sortBest(List<String> textbooks) {
        return textbooks.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(toList());
    }
}
