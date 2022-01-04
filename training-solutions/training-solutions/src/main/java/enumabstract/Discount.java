package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return getDiscountedAmount(price, pieces, DISCOUNT_SPECIAL);
        }
    },

    BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces < 3) {
                return getDiscountedAmount(price, pieces, DISCOUNT_BLACK_FRIDAY);
            } else {
                return
                    getDiscountedAmount(price, 1, DISCOUNT_BLACK_FRIDAY_TOP) +
                    getDiscountedAmount(price, pieces - 1, DISCOUNT_BLACK_FRIDAY);
            }
        }
    };

    // --- attributes ---------------------------------------------------------

    private static final double DISCOUNT_SPECIAL = 0.2;
    private static final double DISCOUNT_BLACK_FRIDAY = 0.25;
    private static final double DISCOUNT_BLACK_FRIDAY_TOP = 0.5;

    // --- public methods -----------------------------------------------------

    public abstract double getAmountToPay(int price, int pieces);

    public double getDiscountedAmount(int price, int pieces, double discount) {
        return pieces * price * (1 - discount);
    }
}