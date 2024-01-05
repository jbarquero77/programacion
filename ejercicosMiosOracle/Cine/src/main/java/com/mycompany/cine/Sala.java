/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author joseb
 */
public class Sala {
    
    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;
    
    public Sala(int filas, int columnas, double precio, Pelicula pelicula){
        
        asientos = new Asiento [filas][columnas];
        this.asientos = asientos;
        this.precio = precio;
        this.pelicula = pelicula;
        rellenaButacas();
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    private void rellenaButacas(){
        
        int fila=asientos.length;
        
        
        for(int i=0;i<asientos.length;i++){
            for(int j=0;j<asientos[0].length;j++){
                
                asientos[i][j]= new Asiento((char)('A'+j),fila);
            }
            fila--;
        }
        
    }
    
    
}
