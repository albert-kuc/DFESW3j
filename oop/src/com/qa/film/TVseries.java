package com.qa.film;

public class TVseries extends Film {

    private int seasons;

    // Constructor

    public TVseries(String title, int releaseDate, String[] actors, int runtimeInMinutes, int seasons) {
        super(title, releaseDate, actors, runtimeInMinutes);
        this.seasons = seasons;
    }

    // String representation

    public String toString() {
        return "Title:        " + getTitle() +
               "\nRelease date: " + getReleaseDate() +
               "\nCast:         " + getCast() +
               "\nRuntime:      " + getRuntimeInMinutes() +
               "\nSeasons:      " + seasons +
               "\n------------------------------";
    }

    // Getters and setters

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}
