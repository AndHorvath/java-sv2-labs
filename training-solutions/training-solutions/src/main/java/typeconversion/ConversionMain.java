package typeconversion;

import java.util.Arrays;

public class ConversionMain {

    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        // --- Double-ből double ----------------------------------------------

        System.out.println(conversion.convertDoubleToDouble(1.23));

        // --- Egész számokból egész számok -----------------------------------

        System.out.println(
                Arrays.toString(
                        conversion.convertIntArrayToByteArray(new int[] { 5, -14, 6, 2, 125, 354, 9738, 3 })));

        // --- Az első tizedesjegy --------------------------------------------

        System.out.println(conversion.getFirstDecimal(1.23));
    }
}