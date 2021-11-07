package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double doubleToConvert) {
        return (double) (int) doubleToConvert;
    }

    public byte[] convertIntArrayToByteArray(int[] intArray) {
        byte[] byteArray = new byte[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            byteArray[i] =
                    Integer.toBinaryString(intArray[i]).length() > 7 ?
                    -1 : (byte) intArray[i];
        }
        return byteArray;
    }

    public int getFirstDecimal(double doubleToConsider) {
        return (int) ((doubleToConsider - (int) doubleToConsider) * 10D);
    }
}