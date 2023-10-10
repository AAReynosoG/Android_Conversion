package com.example.convert.models;

public class Kelvin extends Grado {

    public Kelvin(Double valor){
        this.setValor(valor);
        this.setUnidad("K");
    }

    public Kelvin Parse(Celsius c){
        return new Kelvin(c.getValor());
    }

    public Kelvin Parse(Farenheit f){
        return new Kelvin(f.getValor());
    }
}
