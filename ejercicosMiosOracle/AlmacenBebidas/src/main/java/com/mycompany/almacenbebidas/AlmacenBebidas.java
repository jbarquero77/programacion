/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.almacenbebidas;

/**
 *
 * @author joseb
 */
public class AlmacenBebidas {

    public static void main(String[] args) {
       Almacen a = new Almacen();
       Bebida b;
       for (int i=0;i<10;i++){
           switch(i%2){
               case 0:
                   b=new AguaMineral("Manantial Norte", 1.5,5,"Fontvella");
                   a.agregarBebida(b);
                   break;
               case 1:
                   b=new BebidaAzucarada(0.2, true, 1.5, 10, "Fuentevieja");
                   a.agregarBebida(b);
                   break;
           }
       }
       
       a.mostrarBebidas();
       
        System.out.println(a.calcularPrecioBebidas());
       
       a.eliminarBebida(6);
       a.mostrarBebidas();
       
        System.out.println(a.calcularPrecioBebidas());
        
        System.out.println(a.calcularPrecioBebidas("Fontvella"));
        
        System.out.println(a.calcularPrecioBebidas(0));
       
    }
}
