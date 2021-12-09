package defaultconstructor.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    SimpleDateFormatter simpleDateFormatter;
    SimpleDate simpleDate;

    @BeforeEach
    void setUp() {
        simpleDateFormatter = new SimpleDateFormatter();
        simpleDate = new SimpleDate();
        simpleDate.setDate(2020, 7, 1);
    }

    @Test
    void getDefaultCountryCodeTest() {
        assertEquals(CountryCode.HU, simpleDateFormatter.getDefaultCountryCode());
    }

    @Test
    void formatDateStringTest() {
        assertEquals("2020-7-1", simpleDateFormatter.formatDateString(simpleDate));
    }

    @Test
    void formatDateStringByCountryCodeTest() {
        assertEquals(
                "2020-7-1",
                simpleDateFormatter.formatDateStringByCountryCode(simpleDate, CountryCode.HU));
        assertEquals(
                "1-7-2020",
                simpleDateFormatter.formatDateStringByCountryCode(simpleDate, CountryCode.EN));
        assertEquals(
                "7-1-2020",
                simpleDateFormatter.formatDateStringByCountryCode(simpleDate, CountryCode.US));
    }
}