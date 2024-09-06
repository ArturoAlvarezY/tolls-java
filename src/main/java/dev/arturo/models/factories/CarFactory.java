package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;
import dev.arturo.models.vehiclesproduct.Car;

public class CarFactory extends VehicleFactory {

    public CarFactory(String carRegistration) {
        super(carRegistration);
    }

    @Override
    public IVehicle creatVehicle() {
        return new Car();
    }

}
