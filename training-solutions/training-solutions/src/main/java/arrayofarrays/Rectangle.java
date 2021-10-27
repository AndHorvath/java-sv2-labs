package arrayofarrays;

public class Rectangle {

    public int[][] rectangularMatrix(ArrayCreator arrayCreator, int size) {
        int[][] rectangularMatrix = new int[size][];

        for (int i = 0; i < size; i++) {
            rectangularMatrix[i] = arrayCreator.createConstantArray(i, size);
        }
        return rectangularMatrix;
    }
}
