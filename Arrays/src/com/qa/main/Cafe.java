/*
Exercise - You are running a successful cafe called QA-Cafe.
With a list of orders, create methods with parameters that can do the following:

2 ArrayLists, one doneOrders and orders
- Add a new order to an orders array
- Move an existing order to a 'Done orders array'
- Return the name of an order
- Modify the order by index with a new name
- Remove the order from either arrays
- Print the length of either arrays
- Clear either arrays

Orders list:
Small Espresso
Large Cold Brew
Medium Cappucinok
Medium Flat White
Large Choc Cookie Frappe
Small Caramel Iced Latte
Small Americano
Large Cafe Au Lait
Medium Strawberry Iced Tea
 */

package com.qa.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Cafe {

    public static String[] defaultOrdersArray = {"Small Espresso", "Large Cold Brew", "Medium Cappucinok",
                            "Medium Flat White", "Large Choc Cookie Frappe", "Small Caramel Iced Latte",
                            "Small Americano", "Large Cafe Au Lait", "Medium Strawberry Iced Tea"};

    public static ArrayList<String> ordersList = new ArrayList<>();
    public static ArrayList<String> doneOrdersList = new ArrayList<>();

    public static void setupOrdersList() {
        ordersList.addAll(Arrays.asList(defaultOrdersArray));
    }

    public static void addOrder(String newOrder) {
        ordersList.add(newOrder);
    }

    public static void moveOrderToDone(int index) {
        // move elements between ArrayLists
        doneOrdersList.add(ordersList.get(index));
        ordersList.remove(index);

    }

    public static String printOrder(int index) {
        return ordersList.get(index);
    }

    public static void updateOrder(int index, String newOrder) {
        ordersList.set(index, newOrder);
    }

    public static void removeOrder(ArrayList<String> submittedOrdersList, int index) {
        submittedOrdersList.remove(index);
    }

    public static int ordersLength(ArrayList<String> submittedOrdersList) {
        return submittedOrdersList.size();
    }

    public static void printOrders(ArrayList<String> submittedOrdersList) {
        // print string representation for the submitted ArrayList
        System.out.println(submittedOrdersList.toString());
    }
}
