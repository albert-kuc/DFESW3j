package com.qa.main;

import java.util.ArrayList;
import java.util.Arrays;

public class pizzaList {

    public static ArrayList<String> pizzaList = new ArrayList<>();

    public static void setupArray() {
        pizzaList.add("default pizza");
    }

    public static void addPizza() {

        System.out.println(pizzaList);
        String[] pizzasArray = {"Pepperoni", "Hawaiian", "Meat Feast"};
        pizzaList.addAll(Arrays.asList(pizzasArray));

        System.out.println(pizzaList);
    }

    public static String getPizza(int index) {
        return pizzaList.get(index);  // return object at index
    }

    public static void removePizza(int index) {
        pizzaList.remove(index);  // will remove object at index
    }

    public static void updatePizza(int index, String newPizza) {
        pizzaList.set(index, newPizza);
    }

    public static void clearAllPizzas() {
        pizzaList.clear();
    }

    public static void getAllPizzas() {
        if (pizzaList.size() == 0) {
            System.out.println("pizzaList is empty");
        } else {
            forLoopArrayList();
        }
    }

    public static void forLoopArrayList() {
        // print out all the pizzas line by line using a loop

        for (String pizza : pizzaList) {
            System.out.println(pizza);
        }
    }
}
