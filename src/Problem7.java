import Util.MathUtil;

/**
 * Created by Andrew on 9/22/2014.
 */
public class Problem7 {

    private static final int LIMIT = 10001;

    public static void main(String[] args) {
        int currentPrime = 2;
        int primesFound = 1;

        while (primesFound < LIMIT) {
            currentPrime = nextPrimeNumber(currentPrime);
            primesFound++;
        }

        System.out.println("10,001th Prime is " + currentPrime);
    }

    private static int nextPrimeNumber(int currentPrime) {
        do {
            currentPrime++;
        } while(!MathUtil.isPrime(currentPrime));

        return currentPrime;
    }


}
