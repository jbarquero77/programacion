/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author joseb
 */
public class Comercial extends Empleado {

    //Atributos
    private double comision;

    //Constructores
    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    //Metodos
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    /**
     * Devuelve el estado del objeto, llama primero al toString de la clase
     * padre
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " comisión=" + comision;
    }

    /**
     * Si edad > 30 años y comision > 200, aumentamos el sueldo
     *
     * @return
     */
    @Override
    public boolean plus() {

        if (super.getEdad() > 30 && this.comision > 200) {
            //Con super. llamo a un metodo de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Plus añadido al Comercial " + super.getNombre());
            return true;
        }

        return false;

    }
}