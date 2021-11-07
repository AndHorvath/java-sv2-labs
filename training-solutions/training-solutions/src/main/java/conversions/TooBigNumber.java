package conversions;

public class TooBigNumber {

    public long getRightResult(int number) {
        return (long) Integer.MAX_VALUE + number;
    }
}