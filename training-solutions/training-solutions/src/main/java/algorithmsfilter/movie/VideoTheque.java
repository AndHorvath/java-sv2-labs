package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    // --- attributes ---------------------------------------------------------

    private List<Movie> movies;

    // --- constructors -------------------------------------------------------

    public VideoTheque(List<Movie> movies) {
        this.movies = movies;
    }

    // --- getters and setters ------------------------------------------------

    public List<Movie> getMovies() { return movies; }

    // --- public methods -----------------------------------------------------

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getCategory() == category && movie.getRating() > 3) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }
}