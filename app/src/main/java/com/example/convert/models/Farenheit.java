package com.example.convert.models;

public class Farenheit extends Grado {

    public Farenheit(Double valor){
        this.setValor(valor);
        this.setUnidad("F");
    }

    public Celsius Parse(Celsius c){
        double valor = (getValor());
    }

    public Farenheit Parse(Kelvin k){
        return new Farenheit(k.getValor());
    }

}
