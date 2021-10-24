// Represents garage which takes vehicle instances which are added to an ArrayList.
// Vehicles may be fixed which returns an arbitrary number, potentially representing a cost.

package com.qa.garage;

import com.qa.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class Garage {

    private ArrayList<Vehicle> inGarage = new ArrayList<>();

    // Constructor

    public Garage(Vehicle[] inGarage) {
        this.inGarage.addAll(Arrays.asList(inGarage));
    }

    // Custom methods

    public void addVehicle(Vehicle newVehicle) {
        inGarage.add(newVehicle);
    }

    public void removeVehicle(int index) {
        if (index > (inGarage.size() - 1)) {
            System.out.println("Index [" + index + "] out of range. Number of Vehicles in Garage is " + inGarage.size());
            return;
        }
        inGarage.remove(index);
    }

    public void removeAllVehicles() {
        inGarage.clear();
    }

    public int fixVehicle(int index) {
        if (index > (inGarage.size() - 1)) {
            System.out.println("Index [" + index + "] out of range. Number of Vehicles in Garage is " + inGarage.size());
            return -1;
        }
        return inGarage.get(index).fixVehicle();
    }

    public void getInGarage() {
        // Returns listed string representation for vehicles in inGarage
        if (inGarage.size() == 0) {
            System.out.println("No vehicles in garage.");
        } else {
            for (int i=0; i < inGarage.size(); i++) {
                System.out.println((i+1) + ". " + inGarage.get(i));
            }
        }

    }
}
