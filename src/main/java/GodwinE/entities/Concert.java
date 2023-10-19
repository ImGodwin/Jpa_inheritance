package GodwinE.entities;

import java.time.LocalDate;

public class Concert extends Event{
    private Genre genre;
    private State streaming;

    public Concert(String title, LocalDate date, String description, EventType eventtype, int maxNumOfParticipants, Genre genre, State streaming) {
        super(title, date, description, eventtype, maxNumOfParticipants);
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
