package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;

public abstract class VehicleFactory {

    private String carRegistration;

    public VehicleFactory(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public abstract IVehicle creatVehicle();

    
}
