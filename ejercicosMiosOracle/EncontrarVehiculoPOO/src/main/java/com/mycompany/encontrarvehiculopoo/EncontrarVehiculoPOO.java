/**Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, 
 * imprima las propiedades del vehículo más barato. 
 * Para ello, se deberán leer por teclado las características de cada vehículo y 
 * crear una clase que represente a cada uno de ellos.
 *
 * @author joseb
 */
 

package com.mycompany.encontrarvehiculopoo;

import java.util.Scanner;

public class EncontrarVehiculoPOO {
    public static int indiceCocheBarato(Vehiculo coches[]){
        float precio;
        int indice=0;
        
        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length;i++){
            if (coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.println("¿Cuántos vehículos va a ingresar?");
        numeroVehiculos = entrada.nextInt();
        
        Vehiculo coches[]=new Vehiculo[numeroVehiculos];
        for (int i=0; i<coches.length;i++){
            entrada.nextLine();
            System.out.println("Inserta las características del coche"+(i+1)+":");
            System.out.println("Introduzca la marca: ");
            marca = entrada.nextLine();
            System.out.println("Introduzca el modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca el precio: ");
            precio = entrada.nextFloat();
            
            coches [i] = new Vehiculo (marca, modelo, precio);
            
        }
        indiceBarato = indiceCocheBarato(coches);
        
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
    }
}
