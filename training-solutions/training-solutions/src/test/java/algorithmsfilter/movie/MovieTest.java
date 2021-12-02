package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("Casablanca", Category.ROMANTIC, 4);
    }

    @Test
    void getTitleTest() {
        String expectedTitle = "Casablanca";
        assertEquals(expectedTitle, movie.getTitle());
    }

    @Test
    void getCategoryTest() {
        Category expectedCategory = Category.ROMANTIC;
        assertEquals(expectedCategory, movie.getCategory());
    }

    @Test
    void getRatingTest() {
        int expectedRating = 4;
        assertEquals(expectedRating, movie.getRating());
    }
}