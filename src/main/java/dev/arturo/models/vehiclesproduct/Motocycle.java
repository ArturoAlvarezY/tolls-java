package dev.arturo.models.vehiclesproduct;

import dev.arturo.models.factories.TollFactory;
import dev.arturo.models.implementation.IVehicle;

public class Motocycle implements IVehicle {

    @Override
    public TollFactory amountToPay() {
        throw new UnsupportedOperationException("Unimplemented method 'amountToPay'");
    }
    
}
