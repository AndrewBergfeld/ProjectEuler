/**
 * Created by Andrew on 9/22/2014.
 */
public class Problem5 {

    private static int recursiveLimit = 20;

    public static void main(String[] args) {
        int value = 20;

        while(true) {
            if (isValidAnswer(value)){
                break;
            }

            value++;
        }

        System.out.println("Smallest Evenly Divisible integer is " + value);
    }

    private static boolean isValidAnswer(int value) {
        return isValidAnswer(value, 1);
    }

    private static boolean isValidAnswer(int value, int divisor) {
        if (divisor > recursiveLimit) {
            return true;
        }

        if (value % divisor == 0) {
            divisor++;
            return isValidAnswer(value, divisor);
        }

        return false;
    }



}
