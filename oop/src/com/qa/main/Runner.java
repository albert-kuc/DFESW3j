package com.qa.main;

import com.qa.film.Animation;
import com.qa.film.Film;
import com.qa.film.TVseries;

public class Runner {

    public static void main(String[] args) {

        // Film
        String[] theMatrixCast = {"Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss", "Hugo Weaving"};
        Film theMatrix = new Film("The Matrix", 1999, theMatrixCast, 100);

        String[] shrekCast = {"Mike Mayers", "Eddie Murphy", "Cameron Diaz"};
        Animation shrek = new Animation("Shrek", 2001, shrekCast, 90,
                                        "DreamWorks");

        String[] boardwalkEmpireCast = {"Steve Buscemi", "Kelly Macdonald", "Michael Shannon", "Shea Whigham"};
        TVseries boardwalkEmpire = new TVseries("Boardwalk Empire", 2010, boardwalkEmpireCast,
                                                60, 5);

        System.out.println(theMatrix);
        System.out.println(shrek);
        System.out.println(boardwalkEmpire);

    }
}
