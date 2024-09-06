package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;

public class MotorcycleFactory extends TollFactory{

    public MotorcycleFactory(String name, String city, Integer tollAmount) {
        super(name, city, tollAmount);
    }

    @Override
    public IVehicle creatVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creatVehicle'");
    }
    
}
