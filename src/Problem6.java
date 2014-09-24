/**
 * Created by Andrew on 9/22/2014.
 */
public class Problem6 {

    private static int limit = 100;

    public static void main(String[] args) {
        System.out.println("Difference is " + (calculateSquareOfSums() - calculateSumOfSquares()));
    }

    private static int calculateSumOfSquares() {
        int result = 0;

        for (int i = 0; i <= limit; i++) {
            result = result + i * i;
        }

        return result;
    }

    private static int calculateSquareOfSums() {
        int result = 0;

        for (int i = 0; i <= limit; i++) {
            result = result + i;
        }

        return result * result;
    }
}
