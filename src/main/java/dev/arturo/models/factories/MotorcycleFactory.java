package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;
import dev.arturo.models.vehiclesproduct.Motocycle;

public class MotorcycleFactory extends VehicleFactory {

    public MotorcycleFactory(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public IVehicle creatVehicle() {
        return new Motocycle();
    }

}
