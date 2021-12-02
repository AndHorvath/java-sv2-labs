package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque videoTheque;

    @BeforeEach
    void setUpTest() {
        videoTheque = new VideoTheque(new ArrayList<>(Arrays.asList(
                new Movie("Casablanca", Category.ROMANTIC, 4),
                new Movie("Amadeus", Category.BIOGRAPHIC, 4)
        )));
    }

    @Test
    void getMoviesTest() {
        assertEquals(2, videoTheque.getMovies().size());
        assertEquals("Casablanca", videoTheque.getMovies().get(0).getTitle());
        assertEquals(Category.BIOGRAPHIC, videoTheque.getMovies().get(1).getCategory());
        assertEquals(4, videoTheque.getMovies().get(1).getRating());

    }

    @Test
    void addMovieTest() {
        videoTheque.addMovie(new Movie("Titanic", Category.ROMANTIC, 4));

        assertEquals(3, videoTheque.getMovies().size());
        assertEquals("Titanic", videoTheque.getMovies().get(2).getTitle());
        assertEquals(Category.ROMANTIC, videoTheque.getMovies().get(2).getCategory());
        assertEquals(4, videoTheque.getMovies().get(2).getRating());
    }

    @Test
    void getGoodMoviesWithCategoryGivenTest() {
        videoTheque.addMovie(new Movie("Titanic", Category.ROMANTIC, 4));
        List<Movie> expectedResult = new ArrayList<>(Arrays.asList(
                videoTheque.getMovies().get(0), videoTheque.getMovies().get(2)
        ));
        assertEquals(expectedResult, videoTheque.getGoodMoviesWithCategoryGiven(Category.ROMANTIC));
    }
}