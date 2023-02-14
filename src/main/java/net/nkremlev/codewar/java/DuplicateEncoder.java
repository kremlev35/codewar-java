package net.nkremlev.codewar.java;

/**
 * @see <a href="https://www.codewars.com/kata/54b42f9314d9229fd6000d9c">Duplicate Encoder</a>
 *
 * @author nkremlev
 */
public final class DuplicateEncoder {

    /**
     * Преобразовывает строку в символы '(' если символ появляется один раз , ')' если символ появляется несколько раз
     * @param word строка для преобразования
     * @return преобразованная строка
     */
    public static String encode(String word) {
        char[] charWord = new char[word.length()];
        for (int i = 0; i < charWord.length; i++) {
            charWord[i] = '(';
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (j != i) {
                    if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j)) {
                        charWord[i] = ')';
                        break;
                    } else {
                        charWord[i] = '(';
                    }
                }
            }
        }
        word = String.copyValueOf(charWord);
        return word;
    }

    //Лучшее решение по мнению code-war
    public static String encoderBest(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}
