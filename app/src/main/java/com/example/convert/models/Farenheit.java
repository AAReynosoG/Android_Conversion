package com.example.convert.models;

public class Farenheit extends Grado {

    public Farenheit(Double valor){
        this.setValor(valor);
        this.setUnidad("F");
    }

    public Farenheit Parse(Celsius c){
        return new Farenheit(c.getValor());
    }

    public Farenheit Parse(Kelvin k){
        return new Farenheit(k.getValor());
    }

}
