package com.qa.bike;

import com.qa.vehicle.Vehicle;

public class Bike extends Vehicle {

    private int numberOfWheels;

    // Constructor

    public Bike(int numberOfSeats, String make, String colour, int numberOfWheels) {
        super(numberOfSeats, make, colour);
        this.numberOfWheels = numberOfWheels;
    }

    // Custom method

    @Override
    public int fixVehicle() {
        return 700 * numberOfWheels;
    }

    // Getters and setters

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // String representation

    @Override
    public String toString() {
        return super.toString() +
                "number of wheels: " + numberOfWheels +
                '}';
    }
}
