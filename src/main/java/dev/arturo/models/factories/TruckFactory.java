package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;
import dev.arturo.models.vehiclesproduct.Truck;

public class TruckFactory extends VehicleFactory {

    public TruckFactory(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public IVehicle creatVehicle() {
        return new Truck(null);
    }

}
