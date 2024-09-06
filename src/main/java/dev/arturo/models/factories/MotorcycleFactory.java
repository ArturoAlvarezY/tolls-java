package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;

public class MotorcycleFactory extends TollFactory{

    public MotorcycleFactory(String name, String city, Number tollAmount) {
        super(name, city, tollAmount);
    }

    @Override
    public IVehicle amountToPay() {
        throw new UnsupportedOperationException("Unimplemented method 'amountToPay'");
    }
    
}
