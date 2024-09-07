package videostreaming;

/**
 * Create an abstract class named Video and define the following properties and behaviors:
 * title: a String representing the title of the video
 * duration: an int representing the duration of the video in minutes
 */
public abstract class Video {

    //title: a String representing the title of the video
    private String title;

    //duration: an int representing the duration of the video in minutes
    private int duration;

    /**
     * @param title
     * @param duration
     */
    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    /**
     * getInfo(): a method that returns a String containing
     * all of the video's properties in a readable format
     * @return
     */
    public String getInfo() {
        return "Video title : " + this.title + " - duration : " + duration;
    }
}
