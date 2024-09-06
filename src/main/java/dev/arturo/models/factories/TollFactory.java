package dev.arturo.models.factories;

import dev.arturo.models.implementation.IVehicle;

public abstract class TollFactory {
   
    private String name;
    private String city;
    private Number tollAmount;

    public TollFactory(String name, String city, Number tollAmount) {
        this.name = name;
        this.city = city;
        this.tollAmount = tollAmount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Number getTollAmount() {
        return tollAmount;
    }
    public void setTollAmount(Number tollAmount) {
        this.tollAmount = tollAmount;
    }
    
    public abstract IVehicle amountToPay();
}   
