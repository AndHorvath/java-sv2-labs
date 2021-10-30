package arraylist;

import java.util.ArrayList;
import java.util.List;

public class SecondMain {

    public static void main(String[] args) {
        int[] numberArray = { 3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92 };

        ArrayListHandler arrayListHandler = new ArrayListHandler();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> everySecondNumber;
        Second second;

        arrayListHandler.fillDynamicListFromIntegerArray(numbers, numberArray);
        second = new Second(numbers);
        everySecondNumber = second.getNumbersAccordingToFrequency();

        System.out.println(everySecondNumber);
    }
}
