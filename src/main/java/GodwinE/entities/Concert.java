package GodwinE.entities;

public class Concert extends Event{
    private Genre genre;
    private State streaming;

    public Concert(Genre genre, State streaming) {
        this.genre = genre;
        this.streaming = streaming;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "genre=" + genre +
                ", streaming=" + streaming +
                '}';
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public State getStreaming() {
        return streaming;
    }

    public void setStreaming(State streaming) {
        this.streaming = streaming;
    }
}
