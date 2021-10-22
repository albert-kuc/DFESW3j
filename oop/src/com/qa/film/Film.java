package com.qa.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Film {

    private String title;
    private int releaseDate;
    private ArrayList<String> cast = new ArrayList<>();
    private int runtimeInMinutes;

    // Constructor

    public Film(String title, int releaseDate, String[] actors, int runtimeInMinutes) {
        super();
        this.title = title;
        this.releaseDate = releaseDate;
        this.runtimeInMinutes = runtimeInMinutes;
        this.cast.addAll(Arrays.asList(actors));
    }

    // String representation

    public String toString() {
        return "Title:        " + title +
               "\nRelease date: " + releaseDate +
               "\nCast:         " + cast.toString() +
               "\nRuntime:      " + runtimeInMinutes +
               "\n------------------------------";
    }

    // Custom method

    public void addActorToCast(String name) {
        if (Objects.equals(name, "")) {
            System.out.println("Cannot add empty string to actors.");
            return;
        }
        cast.add(name);
    }

    // Getters and setters

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (Objects.equals(title, "")) {
            System.out.println("Title cannot be an empty string.");
            return;
        }
        this.title = title;
    }

    public String getCast() {
        return this.cast.toString();
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }
}
