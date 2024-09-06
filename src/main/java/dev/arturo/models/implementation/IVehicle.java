package dev.arturo.models.implementation;

import dev.arturo.models.factories.TollFactory;

public interface IVehicle {
    public Number amountToPay(TollFactory tollFactory);
}
