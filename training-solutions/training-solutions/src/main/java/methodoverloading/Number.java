package methodoverloading;

public enum Number {

    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

    // --- attributes ---------------------------------------------------------

    private final int value;

    // --- constructors -------------------------------------------------------

    Number(int value) {
        this.value = value;
    }

    // --- getters ------------------------------------------------------------

    public int getValue() { return value; }
}