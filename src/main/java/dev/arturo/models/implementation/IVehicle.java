package dev.arturo.models.implementation;

import dev.arturo.models.factories.TollFactory;

public interface IVehicle {
    public TollFactory amountToPay();
}
