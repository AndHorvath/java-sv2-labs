package array;

public class ArrayMain {

    public static void main(String[] args) {

        // --- weekdays -------------------------------------------------------

        String[] weekdays = {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday" };

        System.out.println(weekdays[1]);
        System.out.println(weekdays.length);

        // --- powers of two --------------------------------------------------

        int[] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;
        String valueSeparator = " ";

        System.out.print(powersOfTwo[0] + valueSeparator);
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
            System.out.print(powersOfTwo[i] + (i < powersOfTwo.length - 1 ? valueSeparator : "\n"));
        }

        // --- booleans -------------------------------------------------------

        boolean[] booleanValues = new boolean[6];

        for (int i = 1; i < booleanValues.length; i++) {
            booleanValues[i] = !booleanValues[i - 1];
        }
        for (boolean booleanValue: booleanValues) {
            System.out.print(booleanValue + " ");
        }
    }
}