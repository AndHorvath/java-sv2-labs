package conversions;

public class DigitsMain {

    public static void main(String[] args) {
        Digits digits = new Digits();

        digits.addDigitsToList("a7sjs5v1vs8e7e539es4ash1g5d8s2s");
        System.out.println(digits.getIntegerList());
    }
}