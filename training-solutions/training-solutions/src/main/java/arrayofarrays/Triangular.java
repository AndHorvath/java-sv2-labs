package arrayofarrays;

public class Triangular {

    public int[][] triangularMatrix(ArrayCreator arrayCreator, int size) {
        int[][] triangularMatrix = new int[size][];

        for (int i = 0; i < size; i++) {
            triangularMatrix[i] = arrayCreator.createConstantArray(i, i + 1);
        }
        return triangularMatrix;
    }
}
