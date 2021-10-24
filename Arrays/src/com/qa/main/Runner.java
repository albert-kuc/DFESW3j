package com.qa.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        // Using TenNumbers... to create arrays of numbers
        System.out.println("Using TenNumbers...");

        int[] firstArray = TenNumbers.CreateArrayOfNumbers();
        System.out.println(Arrays.toString(firstArray));
        int[] secondSqArray = TenNumbers.CreateArrayOfSquaredValues(firstArray);
        System.out.println(Arrays.toString(secondSqArray));
        int[] reversedSqArray = TenNumbers.CreateReversedArrayOfSquaredValues(firstArray);
        System.out.println(Arrays.toString(reversedSqArray));

        // Using pizzaList... to create ArrayList
        System.out.println("Using pizzaList...");
        pizzaList.setupArray();
        pizzaList.addPizza();
        System.out.println(pizzaList.getPizza(1));

        // Using Cafe... to interact between two ArrayLists
        System.out.println("Using Cafe...");
        // Generate
        Cafe.setupOrdersList();
        Cafe.printOrders(Cafe.ordersList);
        Cafe.printOrders(Cafe.doneOrdersList);
        // Move two first elements and the last element from ordersList to doneOrdersList
        Cafe.moveOrderToDone(0);
        Cafe.moveOrderToDone(0);
        Cafe.moveOrderToDone(Cafe.ordersLength(Cafe.ordersList)-1);
        // Print updated lists
        System.out.println("Orders and Done orders lists after transferring elements.");
        Cafe.printOrders(Cafe.ordersList);
        Cafe.printOrders(Cafe.doneOrdersList);

    }
}
