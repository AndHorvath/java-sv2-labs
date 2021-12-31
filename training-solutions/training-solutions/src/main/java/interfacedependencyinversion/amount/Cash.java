package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int auxAmount = amount / 10 * 10;
        int reminder = amount % 10;

        if (Math.abs(5 - reminder) < 3) {
            return auxAmount + 5;
        } else if (5 - reminder > 0) {
            return auxAmount;
        } else {
            return auxAmount + 10;
        }
    }
}