package initializer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RateTest {

    Rate rate;

    @BeforeEach
    void setUp() {
        rate = new Rate(Currency.EUR, 365.8d);
    }

    @Test
    void getCurrencyTest() {
        assertEquals(Currency.EUR, rate.getCurrency());
    }

    @Test
    void getExchangeRateTest() {
        assertEquals(365.8d, rate.getExchangeRate(), getEpsilon());
    }

    @Test
    void setExchangeRateTest() {
        rate.setExchangeRate(355.8d);
        assertEquals(355.8d, rate.getExchangeRate(), getEpsilon());
    }

    public double getEpsilon() {
        return Math.pow(10d, -5d);
    }
}