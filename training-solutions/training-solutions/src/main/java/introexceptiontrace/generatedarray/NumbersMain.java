package introexceptiontrace.generatedarray;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {
        Change change = new Change();
        int[] changedArray = change.changeNumbers();

        System.out.println(Arrays.toString(changedArray));/*

        A NumbersMain osztály main metódusa meghívja a Change osztály changeNumbers() metódusát,
        ami meghívja a RandomOperations osztály getNumbers() metódusát, ami végül ArrayIndexOutOfBounds
        kivételt dob, mert a végrehajtott for ciklus i <= lengthOfArray ciklusfeltétele szerint
        a numbers tömb olyan indexű elemének kellene értéket adni, amely index a tömbön nem létezik.

        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
        at introexceptiontrace.generatedarray.RandomOperations.getNumbers(RandomOperations.java:14)
        at introexceptiontrace.generatedarray.Change.changeNumbers(Change.java:6)
        at introexceptiontrace.generatedarray.NumbersMain.main(NumbersMain.java:9)*/
    }
}