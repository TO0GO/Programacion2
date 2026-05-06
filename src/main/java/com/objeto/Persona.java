package com.objeto;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Persona {
    @Getter
    private int CI;
    private String nombre;
    private int edad;
    private double estatura;
    private double peso;

   
   


    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

   

    // Setters
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getPeso(){
        return peso;
    }

    public double pesoEnKg(){
        double kg=peso * 0.3545;
        return kg;
    }
    public double estaturaEnMetros(){
        double m=estatura/100;
        return m;
    }

}
