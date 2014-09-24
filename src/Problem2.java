/**
 * Created by Andrew on 9/21/2014.
 */
public class Problem2 {

    private static int sum = 0;
    private static int previousFibNum = 1;
    private static int currentFibNum = 2;

    public static void main(String[] args) {
        int temp;

        while (currentFibNum < 4000000) {
            if (isEven(currentFibNum)) {
                sum = sum + currentFibNum;
            }

            temp = currentFibNum;
            currentFibNum = currentFibNum + previousFibNum;
            previousFibNum = temp;
        }

        System.out.println("Sum = " + sum);
    }

    private static boolean isEven(int num) {
        return (num % 2) == 0;
    }


}
