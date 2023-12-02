package practical;

import java.util.HashMap;
import java.util.Map;

// Write a Java program to print digitsToWords(int number)
// for example digitToWords(321) should print three two ones?
// 321 -> three two one

public class Recursion_Example2 {
    public static Map<Integer, String> digitWordsMap = new HashMap();

    public static void initialize() {
        digitWordsMap.put(0, "zero ");
        digitWordsMap.put(1, "one ");
        digitWordsMap.put(2, "two ");
        digitWordsMap.put(3, "three ");
        digitWordsMap.put(4, "four ");
        digitWordsMap.put(5, "five ");
        digitWordsMap.put(6, "six ");
        digitWordsMap.put(7, "seven ");
        digitWordsMap.put(8, "eight ");
        digitWordsMap.put(9, "nine ");
    }

    public static void main(String[] args) {
        initialize();
        System.out.println(digitToWords(341));
    }

    public static String digitToWords(int number) {
        String digitToWords = "";

        if (number < 10) {
            digitToWords += digitWordsMap.get(number);
            return digitToWords;
        }

        return digitToWords(number / 10) + digitWordsMap.get(number % 10);
    }

}
