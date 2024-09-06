package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;

public class CarFactory extends VehicleFactory {

    public CarFactory(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public IVehicle creatVehicle() {
        throw new UnsupportedOperationException("Unimplemented method 'creatVehicle'");
    }

    
    
}
