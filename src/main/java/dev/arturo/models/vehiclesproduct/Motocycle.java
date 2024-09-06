package dev.arturo.models.vehiclesproduct;

import dev.arturo.models.factories.TollFactory;
import dev.arturo.models.implementation.IVehicle;

public class Motocycle implements IVehicle {

    @Override
    public Number amountToPay(TollFactory tollFactory) {
        tollFactory.setTollAmount(tollFactory.getTollAmount()+1);
        return 50;
    }
    
}
