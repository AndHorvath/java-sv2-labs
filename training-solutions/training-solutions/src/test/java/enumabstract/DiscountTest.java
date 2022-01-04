package enumabstract;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    double epsilon;

    @BeforeEach
    void setUp() {
        epsilon = Math.pow(10, -5);
    }

    @Test
    void getAmountToPayTest() {
        assertEquals(8000, Discount.SPECIAL_OFFER.getAmountToPay(2000, 5), epsilon);

        assertEquals(3000, Discount.BLACK_FRIDAY_OFFER.getAmountToPay(2000, 2), epsilon);
        assertEquals(7000, Discount.BLACK_FRIDAY_OFFER.getAmountToPay(2000, 5), epsilon);
    }

    @Test
    void getDiscountedAmountTest() {
        assertEquals(3.6, Discount.SPECIAL_OFFER.getDiscountedAmount(2, 3, 0.4), epsilon);
    }
}