package com.example.convert.models;

public class Kelvin extends Grado {

    public Kelvin(Double valor){
        this.setValor(valor);
        this.setUnidad("K");
    }

    public Celsius Parse(Celsius c){
        double valor = (getValor() - 273.15);
        return new Celsius(valor);
    }

    public Farenheit Parse(Farenheit f){
        double valor = (getValor() - 273.15) * 9/5 + 32;
        return new Farenheit(valor);
    }
}
