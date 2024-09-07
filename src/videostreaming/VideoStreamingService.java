package videostreaming;

//Video Streaming Service
//Suppose you are building a video streaming service. All videos are either TV series or movies.
//Create an abstract class named Video and define the following properties and behaviors:
//title: a String representing the title of the video
//duration: an int representing the duration of the video in minutes
//getInfo(): a method that returns a String containing all of the video's properties in a readable format
//Create two classes that extend Video: TvSeries and Movie.
//TvSeries objects should have an additional episodes property, an int representing the number of episodes in the series.
//Movie objects should have an additional rating property, a double representing the rating of the movie.
public class VideoStreamingService {
    public static void main(String[] args) {

        System.out.println("Welcome to the Ironflix");

        TvSeries prisonBreak = new TvSeries("prison break", 987, 40);
        System.out.println(prisonBreak.getInfo());

        Movie harryPotter = new Movie("harry potter", 500, 2.5);
        System.out.println(harryPotter);
    }
}