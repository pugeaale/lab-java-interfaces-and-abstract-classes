package videostreaming;

/**
 * Movie objects should have an additional rating property, a double representing the rating of the movie.
 */
public class Movie extends Video {

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

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
        setRating(rating);
    }

    @Override
    public String getInfo() {
        return super.getInfo().replace("Video", "Movie") + " - rating : " + getRating();
    }
}
