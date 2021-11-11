package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextInt()) {
            int nextInt = scanner.nextInt();
            if (nextInt > 100) {
                stringBuilder.append(nextInt).append(",");
            }
        }
        if (!stringBuilder.isEmpty()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }
}