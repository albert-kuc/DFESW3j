package com.qa.vehicle;

public class Vehicle {

    private int numberOfSeats;
    private String make;
    private String colour;

    // Constructor

    public Vehicle(int numberOfSeats, String make, String colour) {
        this.numberOfSeats = numberOfSeats;
        this.make = make;
        this.colour = colour;
    }

    // Custom method

    public int fixVehicle() {
        return 500 * numberOfSeats;
    }

    // Getter and setter

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // String representation

    public String toString() {
        // Make | Colour | Number of seats
        return this.getClass().getSimpleName() +
                " {make: " + make +
                "; colour: " + colour +
                "; no of seats: " + numberOfSeats +
                "; ";
    }


}
