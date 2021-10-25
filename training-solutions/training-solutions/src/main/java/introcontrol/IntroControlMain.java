package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(7));
        System.out.println(introControl.subtractTenIfGreaterThanTen(17));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        System.out.println(introControl.greetingToJoe("Jim"));
        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println(introControl.calculateBonus(850_000));
        System.out.println(introControl.calculateBonus(1_100_000));

        System.out.println(introControl.calculateConsumption(4245, 8741));
        System.out.println(introControl.calculateConsumption(8741, 4245));

        introControl.printNumbers(57);

        introControl.printNumbersBetween(47, 59);
        introControl.printNumbersBetween(120, 97);

        introControl.printNumbersBetweenAnyDirection(14, 41);
        introControl.printNumbersBetweenAnyDirection(41, 14);

        introControl.printOddNumbers(99);
        introControl.printOddNumbers(100);
    }
}