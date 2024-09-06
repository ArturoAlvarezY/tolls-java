package dev.arturo;

import dev.arturo.models.Toll;
import dev.arturo.models.factories.TruckFactory;
import dev.arturo.models.factories.VehicleFactory;
import dev.arturo.models.implementation.IVehicle;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
Toll toll = new Toll("Central Toll", "Cityville", 0, null);

        String truckRegistration = "ABC123";
        int truckAxis = 4;

        VehicleFactory truckFactory = new TruckFactory(truckRegistration, truckAxis);
        IVehicle truck = truckFactory.creatVehicle();

        System.out.println("Truck with registration " + truckRegistration + " has " + truckAxis + " axis.");
        Integer amountToPay = truck.amountToPay(toll);
        System.out.println("Amount to pay for the truck: $" + amountToPay);
        System.out.println("Updated toll amount: $" + toll.getTollAmount());
    }    }

