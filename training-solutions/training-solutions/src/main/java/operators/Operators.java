package operators;

public class Operators {

    public boolean isEven(int n) {
        return n == n >> 1 << 1;
    }

    public String getResultOfDivision(int number, int divisor) {
        String resultString = number + " / " + divisor + " = ";

        resultString +=
                number / divisor + ", maradék: " + (number - number / divisor * divisor);
        return resultString;
    }

    public String isNull(String s) {
        return "A megadott string" + (s == null  ? "" : " nem") + " null értékű";
    }

    public boolean isEmpty(String s) {
        return s == null || s.equals("");
    }
}