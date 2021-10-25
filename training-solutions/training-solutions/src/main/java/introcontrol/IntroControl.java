package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number){
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {
        if (sale >= 1_000_000) {
            return (int) ((double) sale * 0.1);
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (next > prev) {
            return next - prev;
        } else {
            return 10_000 - prev + next;
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i < max; i++) {
            System.out.print(i + ",");
        }
        System.out.print(max + System.lineSeparator());
    }

    public void printNumbersBetween(int min, int max) {
        if (min <= max) {
            for (int i = min; i < max; i++) {
                System.out.print(i + ",");
            }
            System.out.print(max + System.lineSeparator());
        } else {
            for (int i = max; i < min; i++) {
                System.out.print(i + ",");
            }
            System.out.print(min + System.lineSeparator());
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a <= b) {
            for (int i = a; i < b; i++) {
                System.out.print(i + ",");
            }
        } else {
            for (int i = a; i > b; i--) {
                System.out.print(i + ",");
            }
        }
        System.out.print(b + System.lineSeparator());
    }

    public void printOddNumbers(int max) {
        int i;

        for (i = 1; i < max - 1; i += 2) {
            System.out.print(i + ",");
        }
        System.out.print(i + System.lineSeparator());
    }
}