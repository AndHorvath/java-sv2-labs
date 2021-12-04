package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers) {
        if (numbers.length > 1) {
            return numbers[numbers.length - 1] + getSum(Arrays.copyOf(numbers, numbers.length - 1));
        } else if (numbers.length == 1) {
            return numbers[0];
        } else {
            return 0;
        }
    }
}