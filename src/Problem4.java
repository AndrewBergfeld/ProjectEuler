/**
 * Created by Andrew on 9/21/2014.
 */
public class Problem4 {

    private static int largestPalindrome = 0;
    private static Integer product;

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {

                product = i * j;

                if (isPalindrome(product.toString())) {
                  if (largestPalindrome < product) {
                      largestPalindrome = product;
                  }
                }
            }
        }

        System.out.println("Largest Plaindrome is " + largestPalindrome);

    }



    private static boolean isPalindrome(String numberAsString) {
        if (numberAsString.length() % 2 != 0) {
            return false;
        }

        if (numberAsString.charAt(0) == numberAsString.charAt(numberAsString.length() - 1)) {

            if (numberAsString.length() == 2) {
                return true;
            }

            return isPalindrome(numberAsString.substring(1, numberAsString.length() - 1));
        }

        return false;
    }

}
