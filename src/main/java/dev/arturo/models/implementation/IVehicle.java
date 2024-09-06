package dev.arturo.models.implementation;

import dev.arturo.models.Toll;

public interface IVehicle {
    public Number amountToPay(Toll tollFactory);
}
