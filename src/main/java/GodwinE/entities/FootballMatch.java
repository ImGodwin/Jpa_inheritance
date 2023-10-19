package GodwinE.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Football Match")
public class FootballMatch extends Event{

    private String homeTeam;
    private String awayTeam;
    private String winner;
    private int goalsScored;
    private int goalsByAwayTeam;

    public FootballMatch(String title, LocalDate date, String description,
                         EventType eventtype, int maxNumOfParticipants, String homeTeam, String awayTeam, String winner,
                         int goalsScored, int goalsByAwayTeam) {
        super(title, date, description, eventtype, maxNumOfParticipants);
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.winner = winner;
        this.goalsScored = goalsScored;
        this.goalsByAwayTeam = goalsByAwayTeam;
    }

    @Override
    public String toString() {
        return "FootballMatch{" +
                "homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", winner='" + winner + '\'' +
                ", goalsScored=" + goalsScored +
                ", goalsByAwayTeam=" + goalsByAwayTeam +
                '}';
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsByAwayTeam() {
        return goalsByAwayTeam;
    }

    public void setGoalsByAwayTeam(int goalsByAwayTeam) {
        this.goalsByAwayTeam = goalsByAwayTeam;
    }
}
