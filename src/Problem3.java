import static Util.MathUtil.isPrime;

/**
 * Created by Andrew on 9/21/2014.
 */
public class Problem3 {

    private static long givenNumber = 600851475143L;
    private static int largestPrimeFactor = 2;
    private static int currentPrime = 2;

    public static void main(String[] args) {

        while (givenNumber > 2) {
            if (givenNumber % currentPrime == 0) {

                if (currentPrime > largestPrimeFactor) {
                    largestPrimeFactor = currentPrime;
                }

                givenNumber = givenNumber / currentPrime;
            }

            progressCurrentPrime();
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);
    }

    private static void progressCurrentPrime() {
        do {
            currentPrime++;
        } while(!isPrime(currentPrime));
    }

}
