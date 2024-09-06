package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;

public class TruckFactory extends VehicleFactory {

    public TruckFactory(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public IVehicle creatVehicle() {
        throw new UnsupportedOperationException("Unimplemented method 'creatVehicle'");
    }
    
}
