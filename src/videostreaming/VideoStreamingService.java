package videostreaming;

/**
 * Video Streaming Service
 * Suppose you are building a video streaming service. All videos are either TV series or movies.
 */
public class VideoStreamingService {
    public static void main(String[] args) {

        System.out.println("Welcome to the Ironflix");

        // create a Tv series
        TvSeries prisonBreak = new TvSeries("prison break", 987, 40);
        // printing tv series info to check result
        System.out.println(prisonBreak.getInfo());

        //create a movie
        Movie harryPotter = new Movie("harry potter", 500, 2.5);
        // printing movie info to check result
        System.out.println(harryPotter.getInfo());
    }
}