package dev.arturo.models.vehiclesproduct;

import dev.arturo.models.Toll;
import dev.arturo.models.implementation.IVehicle;

public class Truck implements IVehicle{

    private Integer axis;

    public Truck(Integer axis) {
        this.axis = axis;
    }
    
    public Integer getAxis() {
        return axis;
    }

    public void setAxis(Integer axis) {
        this.axis = axis;
    }

    @Override
    public Number amountToPay(Toll tollFactory) {

        tollFactory.setTollAmount(tollFactory.getTollAmount() +1);

       return this.axis * 50;
    }




   
    }
    
