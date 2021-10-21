package com.qa.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Film {

    private String title;
    private int releaseDate;
    private ArrayList<String> actors = new ArrayList<>();
    private int runtimeInMinutes;

    public void addActor(String name) {
        if (Objects.equals(name, "")) {
            System.out.println("Cannot add empty string to actors.");
            return;
        }
        actors.add(name);
    }

    public Film(String title, int releaseDate, String[] actors, int runtimeInMinutes) {
        super();
        this.title = title;
        this.releaseDate = releaseDate;
        this.runtimeInMinutes = runtimeInMinutes;
        this.actors.addAll(Arrays.asList(actors));
    }

    public Film(String title, int releaseDate) {
        super();
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String toString() {
        String objNameString = "Title: " + title;
        objNameString += "\n>> Release date: " + releaseDate;

        if (!actors.isEmpty()) {
            // if actors ArrayList is not empty then add to output string

            objNameString += "\n>> Actors: " + actors.toString();
        }

        if (runtimeInMinutes != 0) {
            // declared int is 0... if runtimeInMinutes is not 0 then add to output string

            objNameString += "\n>> Runtime: " + runtimeInMinutes;
        }

        objNameString += "\n------------------------------";
        return objNameString;
    }

    public void setTitle(String title) {
        if (Objects.equals(title, "")) {
            System.out.println("Title cannot be an empty string.");
            return;
        }
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getActors() {
        return this.actors.toString();
    }


}
