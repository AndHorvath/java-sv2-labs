package math.math;

public class MathMethods {

    public static void main(String[] args) {
        double doubleValue;
        int firstInteger;
        int secondInteger;

        firstInteger = 111;
        secondInteger = 222;
        System.out.println(firstInteger);
        System.out.println(secondInteger);
        System.out.println(Math.max(111, 222));
        System.out.println(Math.min(111, 222));
        System.out.println();

        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println();

        doubleValue = 78.4755124;
        System.out.println(doubleValue);
        System.out.println(Math.round(doubleValue));
        System.out.println();

        doubleValue *= (-1.0);
        System.out.println(doubleValue);
        System.out.println(Math.abs(doubleValue));
        System.out.println();

        System.out.println(Math.negateExact(27));
        System.out.println();

        firstInteger = 1754;
        secondInteger = 412598;
        System.out.println(firstInteger);
        System.out.println(secondInteger);
        System.out.println(Math.addExact(firstInteger, secondInteger));
        System.out.println(Math.subtractExact(firstInteger, secondInteger));
        System.out.println(Math.multiplyExact(firstInteger, secondInteger));
        System.out.println();

        doubleValue = 0.5;
        System.out.println(Math.pow(doubleValue, doubleValue));
        System.out.println(Math.pow(doubleValue, doubleValue) * 2 * Math.pow(doubleValue, doubleValue));
        System.out.println();

        firstInteger = 921;
        System.out.println(firstInteger);
        System.out.println(Math.incrementExact(firstInteger));
        System.out.println(Math.decrementExact(firstInteger));
        System.out.println();

        System.out.println(Math.random());
    }
}