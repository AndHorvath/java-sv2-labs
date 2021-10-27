package arrayofarrays;

public class ArrayMain {

    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        Matrix matrix = new Matrix();
        Triangular triangular = new Triangular();
        Rectangle rectangle = new Rectangle();
        DailyValues dailyValues = new DailyValues();

        int numberOfRows = 4;
        int numberOfColumns = 3;

        int[][] nByMMatrix = matrix.nByMMatrix(arrayCreator, numberOfRows, numberOfColumns);
        arrayOfArrays.printArrayOfArrays(nByMMatrix);
        System.out.println();

        int[][] triangularMatrix = triangular.triangularMatrix(arrayCreator, numberOfRows);
        arrayOfArrays.printArrayOfArrays(triangularMatrix);
        System.out.println();

        int[][] rectangularMatrix = rectangle.rectangularMatrix(arrayCreator, numberOfRows);
        arrayOfArrays.printArrayOfArrays(rectangularMatrix);
        System.out.println();

        int[][] dailyValuesDefault = dailyValues.getValues();
        arrayOfArrays.printArrayOfArrays(dailyValuesDefault);
    }
}
