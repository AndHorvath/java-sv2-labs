package arrayofarrays;

public class ArrayCreator {

    public int[] createNaturalNumbersArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            resultArray[i] = i;
        }
        return resultArray;
    }

    public int[] createConstantArray(int arrayEntry, int arrayLength) {
        int[] resultArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            resultArray[i] = arrayEntry;
        }
        return resultArray;
    }
}
