package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] arrayOfArrays) {
        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                System.out.print(arrayOfArrays[i][j] + (j < arrayOfArrays[i].length - 1 ? " " : ""));
            }
            System.out.print("\n");
        }
    }
}