package com.qa.main;

import com.qa.bike.Bike;
import com.qa.garage.Garage;
import com.qa.helicopter.Helicopter;
import com.qa.vehicle.Vehicle;

public class Runner {

    public static void main(String[] args) {

        // create list of vehicles in garage1 and garage instance
        Vehicle[] inGarage1 = {};
        Garage garage1 = new Garage(inGarage1);

        // create a new vehicle and add to garage1
        Vehicle newBike = new Bike(2, "Harley Davidson", "black", 2);
        garage1.addVehicle(newBike);

        // create a new vehicle and add to garage1
        Vehicle newHelicopter = new Helicopter(7, "unknown", "grey", 2000);
        garage1.addVehicle(newHelicopter);

        // create a new vehicle and add to garage1
        Vehicle secondBike = new Bike(2, "Yamaha", "white", 2);
        garage1.addVehicle(secondBike);

        // list vehicles in garage1
        System.out.println("Added 3 vehicles to garage.");
        garage1.getInGarage();

        // fix vehicle in garage1
        System.out.println("Fix vehicle outputs an arbitrary value.");
        System.out.println(garage1.fixVehicle(1));

        // remove vehicle
        garage1.removeVehicle(0);

        // list vehicles in garage1
        System.out.println("Removed 1 vehicle");
        garage1.getInGarage();

        // remove all vehicles in garage1
        garage1.removeAllVehicles();

        // list vehicles in garage1
        System.out.println("Removed all remaining vehicles.");
        garage1.getInGarage();
    }
}
