package com.qa.main;

import com.qa.cake.CakeTin;
import com.qa.film.Film;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

//        // CakeTin is the data type
//        CakeTin gfSpongeCake = new CakeTin();
//        System.out.println(gfSpongeCake.flavour);

        // Film
        String[] theMatrixActors = {"Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss", "Hugo Weaving"};
        Film theMatrix = new Film("The Matrix", 1999, theMatrixActors, 100);
        theMatrix.addActor("Keanu Reeves");
        theMatrix.addActor("Laurence Fishburne");
        theMatrix.addActor("Carrie-Anne Moss");
        theMatrix.addActor("Hugo Weaving");

        String[] duneActors = {};
        Film dune = new Film("Dune", 2021, duneActors, 150);

        Film fightClub = new Film("Fight Club", 1999);

        System.out.println(theMatrix);
        System.out.println(dune);
        System.out.println(fightClub);

        theMatrix.setTitle("Matrix");
        System.out.println(theMatrix);

        theMatrix.addActor("");
        theMatrix.addActor("Joe Pantoliano");
        System.out.println(theMatrix.getActors());

        System.out.println(fightClub.getTitle());
    }
}
