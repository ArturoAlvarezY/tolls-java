package dev.arturo.models;

import dev.arturo.models.factories.VehicleFactory;

public  class Toll {

    private String name;
    private String city;
    private Integer tollAmount;
    private VehicleFactory vehicleFactory;

    public Toll(String name, String city, Integer tollAmount, VehicleFactory vehicleFactory) {
        this.name = name;
        this.city = city;
        this.tollAmount = tollAmount;
        this.vehicleFactory = vehicleFactory;
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
    public Integer getTollAmount() {
        return tollAmount;
    }
    public void setTollAmount(Integer integer) {
        this.tollAmount = integer;
    }

    public VehicleFactory getVehicleFactory() {
        return vehicleFactory;
    }

    public void setVehicleFactory(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }
}   
