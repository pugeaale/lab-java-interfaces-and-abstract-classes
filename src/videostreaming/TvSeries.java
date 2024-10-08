package videostreaming;

/**
 * TvSeries objects should have an additional episodes property,
 * an int representing the number of episodes in the series.
 */
public class TvSeries extends Video {

    //TvSeries objects should have an additional episodes property,
    // an int representing the number of episodes in the series.
    private int episodes;

    /**
     * @param title
     * @param duration
     * @param episodes
     */
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo().replace("Video", "TV Series") + " - episodes : " + getEpisodes();
    }
}
