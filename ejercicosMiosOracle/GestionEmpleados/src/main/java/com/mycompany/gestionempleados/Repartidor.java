/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author joseb
 */
public class Repartidor extends Empleado {

    //Atributos
    private String zona;

    //Constructores
    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    //Metodos
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + " zona=" + zona;
    }

    /**
     * Si < 25 años y la zona = "zona 3",aumentamos el sueldo al empleado
     * @return 
     */
    @Override
    public boolean plus() {

        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            //Con super. llamo a un método de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Plus añadido al Repartidor "+super.getNombre());
            return true;
        }

        return false;
    }
}