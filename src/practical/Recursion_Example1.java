package practical;

public class Recursion_Example1 {
    public static void main(String[] args) {
        printFrom5To1(5);
        tableOf2(10);
        System.out.println(factorial(100));
        System.out.println(reverse("ABCDE"));
        System.out.println(reverseString("JAVA"));


    }

    //copied from java point
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            System.out.println("String is empty.");
            return str;
        } else {
            String reversedStr = reverseString(str.substring(1)) + str.charAt(0);
            return reversedStr;
        }
    }

    public static String reverse(String str) {
        if (str.isBlank())
            return str;

        String reversedStr = String.valueOf(str.charAt(str.length() - 1));
        return reversedStr + reverse(str.substring(0, str.length() - 1));
    }

    public static int factorial(int number) {
        if (number == 0)
            return 1;

        return number * factorial(number - 1);
    }

    public static void printFrom5To1(int number) {
        if (number == 0)
            return;

        System.out.println("Number : " + number);
        printFrom5To1(number - 1);
    }

    public static void tableOf2(int number) {
        if (number > 10)
            return;

        System.out.println(" 2 x " + number + " = " + number * 2);
        tableOf2(number + 1);
    }
}