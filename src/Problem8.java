import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Problem8 {

    private static final int limit = 13;

    public static void main(String[] args) {
        int i = 0;
        long largestProductSeen = 0;
        ArrayList<Integer> thousandDigitNumber = generateArray();

        while (i < thousandDigitNumber.size() - limit) {
            long product = findProductOfNextNValues(thousandDigitNumber, i, limit);

            if (product > largestProductSeen) {
                largestProductSeen = product;
            }

            i++;
        }

        System.out.println("Largest Product is " + largestProductSeen);
    }

    private static long findProductOfNextNValues(ArrayList<Integer> list, int startingIndex, int limit) {
        long product = 1;

        for (int i = 0; i < limit; i++) {
            product = product * list.get(startingIndex + i);
        }

        return product;
    }

    private static ArrayList<Integer> generateArray() {
        ArrayList<Integer> number = new ArrayList<Integer>();

        for (String sequence : readFile()) {
            for(int i = 0; i < sequence.length(); i++) {
                number.add(Integer.parseInt(String.valueOf(sequence.charAt(i))));
            }
        }

        return number;
    }

    private static ArrayList<String> readFile() {
        Path path = Paths.get("src/1000-digit-number.txt");

        try {
            return (ArrayList<String>) Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error reading file." + e.toString());
            return new ArrayList<String>();
        }
    }
}
