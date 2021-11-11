package stringscanner;

public class IntScannerMain {

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();

        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
        System.out.println(intScanner.convertInts("198"));
        System.out.println(intScanner.convertInts("5;3;12;18"));
        System.out.println(intScanner.convertInts(""));
    }
}