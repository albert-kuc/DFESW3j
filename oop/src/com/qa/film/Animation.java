package com.qa.film;

public class Animation extends Film {

    private String animationStudio;

    // Constructor

    public Animation(String title, int releaseDate, String[] actors, int runtimeInMinutes, String animationStudio) {
        super(title, releaseDate, actors, runtimeInMinutes);
        this.animationStudio = animationStudio;
    }

    // String representation

    @Override
    public String toString() {
        return "Title:        " + getTitle() +
                "\nRelease date: " + getReleaseDate() +
                "\nCast:         " + getCast() +
                "\nRuntime:      " + getRuntimeInMinutes() +
                "\nStudio:       " + animationStudio +
                "\n------------------------------";
    }

    // Getters and setters

    public String getAnimationStudio() {
        return animationStudio;
    }

    public void setAnimationStudio(String animationStudio) {
        this.animationStudio = animationStudio;
    }
}
