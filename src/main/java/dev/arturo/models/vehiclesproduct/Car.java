package dev.arturo.models.vehiclesproduct;

import dev.arturo.models.Toll;
import dev.arturo.models.implementation.IVehicle;

public class Car implements IVehicle {

    @Override
    public Integer amountToPay(Toll toll) {
        toll.setTollAmount(toll.getTollAmount() + 1);
        return 100;
    }

}
