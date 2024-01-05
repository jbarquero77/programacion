/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacenbebidas;

/**
 *
 * @author joseb
 */
public class Almacen {
    
    private Bebida [][] estanteria;
    
    public Almacen (int filas, int columnas){
        estanteria=new Bebida[filas][columnas];
        
    }
    public Almacen(){
        estanteria=new Bebida[5][5];
    }
    
    /* for (int i=0;i<estanteria.length;i++){
            for (int =0;j<estanteria.length;j++){
            
            }
        }
    */
    
    /*Agregar Bebida */
        
    public void agregarBebida(Bebida b){
        
        boolean encontrado=false;
        
        for (int i=0;i<estanteria.length && !encontrado;i++){
            for (int j=0;j<estanteria.length && !encontrado;j++){
                if (estanteria[i][j]==null){
                    estanteria[i][j]=b;
                    encontrado=true;
                    
                }
            }
                
        }
        if(encontrado){
            System.out.println("Bebida Añadida");
        }else{
            System.out.println("El almacen está lleno y no se puede añadir la bebida");
        }
        
    }
    
    /*Eliminar Bebidas*/
    
    public void eliminarBebida(int id){
        
        boolean encontrado=false;
        
        for (int i=0;i<estanteria.length && !encontrado;i++){
            for (int j=0;j<estanteria.length && !encontrado;j++){
                if (estanteria[i][j]!=null){
                    if (estanteria[i][j].getId()== id){
                        estanteria[i][j]=null;
                        encontrado=true;
                        
                    }    
                }
    
            }
                
        }
        if(encontrado){
            System.out.println("Bebida Eliminada");
        }else{
            System.out.println("No existe la bebida");
        }
        
    }
   
    /*Mostrar Bebida*/
     public void mostrarBebidas(){
        
        for (int i=0;i<estanteria.length;i++){
            for (int j=0;j<estanteria.length;j++){
                if (estanteria[i][j]!=null){
                    System.out.println("fila "+i+", columna: "+j+" Bebida: "+estanteria[i][j].toString());  
                }
    
            }
                
        }
        
        
    }
     /*Calcular Precio*/
     
        public double calcularPrecioBebidas() {

        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {//controlo nulos
                    precioTotal += estanteria[i][j].getPrecio();//acumulo el precio
                }
            }
        }

        return precioTotal;

    }

    /* Calculo el precio de todas las bebidas de una marca*/
        
    public double calcularPrecioBebidas(String marca) {

        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {//controlo nulos

                    if (estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
                        precioTotal += estanteria[i][j].getPrecio(); //acumulo el precio
                    }

                }
            }

        }

        return precioTotal;
    }

    /*Calculo el precio de todas las bebidas de una determinada columna*/
    public double calcularPrecioBebidas(int columna) {

        double precioTotal = 0;
        if (columna >= 0 && columna < estanteria[0].length) {

            for (int i = 0; i < estanteria.length; i++) {

                if (estanteria[i][columna] != null) { //controlo nulos
                    precioTotal += estanteria[i][columna].getPrecio(); //acumulo el precio
                }

            }

        } else {
            System.out.println("La columna debe estar entre 0 y " + estanteria[0].length);
        }

        return precioTotal;

    }
    
}
