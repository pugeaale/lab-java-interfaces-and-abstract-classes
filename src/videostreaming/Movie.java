package videostreaming;

/**
 * Movie objects should have an additional rating property, a double representing the rating of the movie.
 */
public class Movie extends Video {

    //Movie objects should have an additional rating property,
    //a double representing the rating of the movie.
    private double rating;

    /**
     * @param title
     * @param duration
     * @param rating
     */
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
}
