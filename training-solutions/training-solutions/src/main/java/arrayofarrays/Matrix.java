package arrayofarrays;

public class Matrix {

    public int[][] nByMMatrix(ArrayCreator arrayCreator, int numberOfRows, int numberOfColumns) {
        int[][] nByMMatrix = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            nByMMatrix[i] = arrayCreator.createNaturalNumbersArray(numberOfColumns);
        }
        return nByMMatrix;
    }
}