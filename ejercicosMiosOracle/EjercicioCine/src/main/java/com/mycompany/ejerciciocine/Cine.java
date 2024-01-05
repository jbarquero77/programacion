/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocine;

/**
 *
 * @author joseb
 */
public class Cine {
    
     private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;

    /*Constructor*/
    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {

        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenaButacas();
    }

    /*Metodos*/
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

    /**
     * Rellena nuestros asientos, dandoles una fila y una letra
     */
    private void rellenaButacas() {

        int fila = asientos.length;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                //Recuerda que los char se pueden sumar
                asientos[i][j] = new Asiento((char) ('A' + j), fila);
            }
            fila--; //Decremento la fila para actualizar la fila
        }

    }

    /**
     *Buscamos asientos libres
     *
     * @return
     */
    public boolean haySitio() {

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {

                if (!asientos[i][j].ocupado()) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Buscar sitio específico
     *
     * @param fila
     * @param letra
     * @return
     */
    public boolean haySitioButaca(int fila, char letra) {
        return getAsiento(fila, letra).ocupado();
    }

    /**
     * Requisitos entrada: edad y dinero 
     * El espacio se controla en el main
     *
     * @param e
     * @return
     */
    public boolean sePuedeSentar(Espectador e) {
        return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMinima());
    }

    /**
     * Asigno asiento
     *
     * @param fila
     * @param letra
     * @param e
     */
    public void sentar(int fila, char letra, Espectador e) {
        getAsiento(fila, letra).setEspectador(e);
    }

    /**
     * Devuelvo un asiento concreto por su fila y letra
     *
     * @param fila
     * @param letra
     * @return
     */
    public Asiento getAsiento(int fila, char letra) {
        return asientos[asientos.length - fila - 1][letra - 'A'];
    }

    /**
     * Filas de la sala
     *
     * @return
     */
    public int getFilas() {
        return asientos.length;
    }

    /**
     * Columnas de la sala
     *
     * @return
     */
    public int getColumnas() {
        return asientos[0].length;
    }

    /**
     * Mostramos la información de nuestro cine
     */
    public void mostrar() {

        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }

    
}
