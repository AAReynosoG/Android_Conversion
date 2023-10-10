package com.example.convert.models;

public class Celsius extends Grado {


    public Celsius(Double valor){
        this.setValor(valor);
        this.setUnidad("C");
    }


    public Celsius Parse(Farenheit F){
        return new Celsius((F.getValor()-32)/1.8);
    }

    public Celsius Parse(Kelvin K){
        return new Celsius((K.getValor()-273.15));
    }
}
