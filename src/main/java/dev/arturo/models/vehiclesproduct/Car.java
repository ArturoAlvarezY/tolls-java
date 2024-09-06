package dev.arturo.models.vehiclesproduct;

import dev.arturo.models.Toll;
import dev.arturo.models.implementation.IVehicle;

public class Car implements IVehicle{

    @Override
    public Number amountToPay(Toll tollFactory) {
        tollFactory.setTollAmount(tollFactory.getTollAmount()+1);
        return 100;
    }
    
}
