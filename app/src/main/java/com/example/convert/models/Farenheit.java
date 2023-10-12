package com.example.convert.models;

public class Farenheit extends Grado {

    public Farenheit(Double valor){
        this.setValor(valor);
        this.setUnidad("F");
    }


    public Celsius Parse(Celsius c){
        double valor = (getValor() - 32) * 5/9;
        return new Celsius(valor);
    }

    public Kelvin Parse(Kelvin k){
        double valor = (getValor() - 32) * 5/9 + 273.15;
        return new Kelvin(valor);
    }
}
