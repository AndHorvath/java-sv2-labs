package algorithmscount.digits;

public class Digits {

    public int getCountOfNumbers() {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (isFiveDifferent(i)) {
                 counter++;
            }
        }
        return counter;
    }

    private boolean isFiveDifferent(int number) {
        return Math.abs(number / 10 - number % 10) == 5;
    }
}