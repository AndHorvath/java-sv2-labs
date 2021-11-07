package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(Integer.toBinaryString(123));

        System.out.println(operators.isEven(29));

        System.out.println(operators.getResultOfDivision(12914, 174));

        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull("null"));

        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("empty"));
    }
}