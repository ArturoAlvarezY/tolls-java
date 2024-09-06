package dev.arturo.models;


public  class Toll {
   
    private String name;
    private String city;
    private Integer tollAmount;
    

    public Toll(String name, String city, Integer tollAmount) {
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
    public Integer getTollAmount() {
        return tollAmount;
    }
    public void setTollAmount(Integer integer) {
        this.tollAmount = integer;
    }
    
}   
