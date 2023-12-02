package practical;

public class Recursion_Example3 {
    // 17 -> 10001
    public static void main(String[] args) {
        System.out.println(decimalToBinary(17));
    }

    private static String decimalToBinary(int number) {
        String binary = "";
        if(number < 2) {
            binary += number;
            return binary;
        }

        return decimalToBinary(number/2) + (binary + (number % 2));
    }

}
