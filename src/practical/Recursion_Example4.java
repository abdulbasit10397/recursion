package practical;

public class Recursion_Example4 {
    public static void main(String[] args) {
        System.out.println(power(9, 6));
    }

    //2^3 -> 2*2*2
    public static int power(int number, int power)
    {
        if(power == 0) return 1;
        if(power == 1) return number;

        return number * power(number, power-1);
    }
}
