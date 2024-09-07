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
        setTitle(title);
        setDuration(duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * getInfo(): a method that returns a String containing
     * all of the video's properties in a readable format
     * @return
     */
    public String getInfo() {
        return "[ Video ] - title : " + getTitle() + " - duration : " + getDuration();
    }
}
