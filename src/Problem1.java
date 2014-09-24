/**
 * Created by Andrew on 9/21/2014.
 */
public class Problem1 {

    private static int sum = 0;

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if (isMultipleOfFive(i) || isMultipleOfThree(i)) {
                sum = sum + i;
            }
        }

        System.out.println("Sum = " + sum);
    }



    private static boolean isMultipleOfFive(int num) {
        return (num % 5) == 0;
    }

    private static boolean isMultipleOfThree(int num) {
        return (num % 3) == 0;
    }

}
