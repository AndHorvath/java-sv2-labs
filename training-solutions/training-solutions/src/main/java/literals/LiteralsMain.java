package literals;

public class LiteralsMain {

    public static void main(String[] args) {
        System.out.println(1 + "2");
        System.out.println("1" + 2);
        System.out.println("1" + "2");
        System.out.println("1".concat("2"));

        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3d / 4d;
        System.out.println(quotient);
        quotient = 3.0 / 4.0;
        System.out.println(quotient);
        quotient = (double) 3 / (double) 4;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        String plusOneAsBinaryNumber = Integer.toBinaryString(1);
        String minusTwoAsBinaryNumber = Integer.toBinaryString(-2);
        System.out.println(plusOneAsBinaryNumber);
        System.out.println(minusTwoAsBinaryNumber);
    }
}