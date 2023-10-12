package com.example.convert.models;

public class Celsius extends Grado {


    public Celsius(Double valor){
        this.setValor(valor);
        this.setUnidad("C");
    }

    public Farenheit Parse(Farenheit f){
        double valor = (getValor() * 9/5) + 32;
        return new Farenheit(valor);
    }

    public Kelvin Parse(Kelvin k) {
        double valor = getValor() + 273.15;
        return new Kelvin(valor);
    }

}
