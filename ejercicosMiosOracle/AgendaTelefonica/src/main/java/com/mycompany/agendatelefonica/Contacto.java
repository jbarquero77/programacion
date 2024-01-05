/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica;

/**
 *
 * @author joseb
 */
public class Contacto {
    
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono=0;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public boolean equals(Contacto c){
        if (this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
    }
    
    
}
