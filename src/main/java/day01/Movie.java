package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int year;
    List<Actor> actors;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        this.actors = new ArrayList<>();
    }

    public boolean addActors(Actor actor) {
        return actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int count = 0;
        for (Actor a : actors)
            if (year - a.getYearOfBirth() < 30 &&
                    year - a.getYearOfBirth() >= 20)
                count++;
        return count;
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Terminator", 1984);
        movie.addActors(new Actor("Arnold", 1947));
        movie.addActors(new Actor("Linda", 1956));
        movie.addActors(new Actor("Shawn", 1961));
        movie.addActors(new Actor("Pistike", 1980));

        System.out.println(movie.actorsInTheirTwenties());

    }

}
