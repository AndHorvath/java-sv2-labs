package introexceptionmoreexceptions;

import java.util.Arrays;

public class ThreeArrays {

    public static void main(String[] args) {
        int[] first = new int[] { 3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0 };
        int[] second = new int[] { 676, 4, 31, 5, 2, 432, 643, 2, 1, 42 };
        int[] third = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            third[i] = first[i] / second[i];
            System.out.println(third[i]);
        }
        System.out.println(Arrays.toString(third));/*

        A first tömbnek van 10-es indexű eleme, a second tömbnek nincs,
        így í = 10 mellett a first[i] / second[i] kifejezés kiértékelésekor
        ArrayIndexOutOfBoundsException keletkezik:
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        at introexceptionmoreexceptions.ThreeArrays.main(ThreeArrays.java:13)*/
    }
}