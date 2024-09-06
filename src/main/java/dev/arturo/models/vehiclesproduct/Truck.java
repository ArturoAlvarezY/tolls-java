package dev.arturo.models.vehiclesproduct;

import dev.arturo.models.Toll;
import dev.arturo.models.implementation.IVehicle;

public class Truck implements IVehicle {

    private Integer axis;

    public Truck(Integer axis) {
        if (axis == null || axis <= 0) {
            throw new IllegalArgumentException("the axis number must be greater than 0!!!");
        }
        this.axis = axis;
    }

    public Integer getAxis() {
        return axis;
    }

    public void setAxis(Integer axis) {
        if (axis == null || axis <= 0) {
            throw new IllegalArgumentException("the axis number must be greater than 0!!!");
        }
        this.axis = axis;
    }

    @Override
    public Integer amountToPay(Toll toll) {

        toll.setTollAmount(toll.getTollAmount() + 1);

        return this.axis * 50;
    }

}
