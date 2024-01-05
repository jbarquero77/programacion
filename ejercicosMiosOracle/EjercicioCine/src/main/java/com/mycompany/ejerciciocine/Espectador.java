/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocine;

/**
 *
 * @author joseb
 */
public class Espectador {
    
     private String nombre;
    private int edad;
    private double dinero;

    /*Constructores*/
    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    /*Metodos*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    /**
     * Pagamos la entrada del cine
     *
     * @param precio
     */
    public void pagar(double precio) {
        dinero -= precio;
    }

    /**
     * Tiene la edad?
     * @param edadMinima
     * @return
     */
    public boolean tieneEdad(int edadMinima) {
        return edad >= edadMinima;
    }

    /**
     * Tiene dinero?
     *
     * @param precioEntrada
     * @return
     */
    public boolean tieneDinero(double precioEntrada) {
        return dinero >= precioEntrada;
    }

    @Override
    public String toString() {
        return "El nombre del espectador es " + nombre + " de " + edad + " años y tiene " + dinero + " euros.";
    }

    
}
