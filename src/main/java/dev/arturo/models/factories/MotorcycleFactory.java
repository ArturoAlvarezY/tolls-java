package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;

public class MotorcycleFactory extends VehicleFactory{

    public MotorcycleFactory(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public IVehicle creatVehicle() {
        throw new UnsupportedOperationException("Unimplemented method 'creatVehicle'");
    }
    
}
