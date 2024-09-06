package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;
import dev.arturo.models.vehiclesproduct.Truck;

public class TruckFactory extends VehicleFactory {

    private Integer axis;

    public TruckFactory(String carRegistration, Integer axis) {
        super(carRegistration);

        if (axis == null || axis == 0) {
            throw new IllegalArgumentException("the Axios must be greater than 0!!");
        }
        this.axis = axis;
    }

    @Override
    public IVehicle creatVehicle() {
        return new Truck(axis);
    }

}
