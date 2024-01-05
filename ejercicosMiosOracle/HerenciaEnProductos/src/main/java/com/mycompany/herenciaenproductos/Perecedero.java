/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaenproductos;

/**
 *
 * @author joseb
 */
public class Perecedero extends Producto{
    
    private int diasParaCaducar;

    public Perecedero(int diasParaCaducar, String nombre, double precio) {
        super(nombre, precio);
        this.diasParaCaducar = diasParaCaducar;
    }

    public int getDiasParaCaducar() {
        return diasParaCaducar;
    }

    public void setDiasParaCaducar(int diasParaCaducar) {
        this.diasParaCaducar = diasParaCaducar;
    }
    
    @Override
    public String toString(){
        return super.toString()+" dias a caducar="+diasParaCaducar;
    }
    
    @Override
    public double calcular(int cantidad){
        
        double precioFinal = super.calcular(cantidad);
        
        switch(diasParaCaducar){
            case 1 -> precioFinal/=4;
            case 2 -> precioFinal/=3;
            case 3 -> precioFinal/=2;
        }
        return precioFinal;
        
    }
}