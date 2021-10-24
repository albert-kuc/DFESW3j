package com.qa.helicopter;

import com.qa.vehicle.Vehicle;

public class Helicopter extends Vehicle {

    private int propellerSpeed;

    // Constructor

    public Helicopter(int numberOfSeats, String make, String colour, int propellerSpeed) {
        super(numberOfSeats, make, colour);
        this.propellerSpeed = propellerSpeed;
    }

    // Custom method

    @Override
    public int fixVehicle(){
        return 500 * getNumberOfSeats() * propellerSpeed;
    }

    // Getters and setters

    public int getPropellerSpeed() {
        return propellerSpeed;
    }

    public void setPropellerSpeed(int propellerSpeed) {
        this.propellerSpeed = propellerSpeed;
    }

    // String representation

    @Override
    public String toString() {
        return super.toString() +
                "propeller speed: " + propellerSpeed +
                '}';
    }
}