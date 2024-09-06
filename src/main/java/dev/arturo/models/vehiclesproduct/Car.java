package dev.arturo.models.vehiclesproduct;

import dev.arturo.models.factories.TollFactory;
import dev.arturo.models.implementation.IVehicle;

public class Car implements IVehicle{

    @Override
    public Number amountToPay(TollFactory tollFactory) {
        return null;
    }
    
}
