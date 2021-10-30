package arraylist;

import java.util.List;

public class ArrayListHandler {

    public void fillDynamicListFromStringArray(List<String> list, String[] array) {
        for (String item : array) {
            list.add(item);
        }
    }

    public void fillDynamicListFromIntegerArray(List<Integer> list, int[] array) {
        for (int item : array) {
            list.add(item);
        }
    }
}