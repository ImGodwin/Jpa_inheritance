package GodwinE.entities;

import java.util.Set;

public class AthleticsCompetition extends Event{

    private Set<Person> athletes;
    private Person winner;

    public AthleticsCompetition(Set<Person> athletes, Person winner) {
        this.athletes = athletes;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "AthleticsCompetition{" +
                "athletes=" + athletes +
                ", winner=" + winner +
                '}';
    }

    public Set<Person> getAthletes() {
        return athletes;
    }

    public void setAthletes(Set<Person> athletes) {
        this.athletes = athletes;
    }

    public Person getWinner() {
        return winner;
    }

    public void setWinner(Person winner) {
        this.winner = winner;
    }
}
