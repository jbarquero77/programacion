/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aleatorioentredos;

/**
 *
 * @author joseb
 */
public class AleatorioEntreDos {

    public static void main(String[] args) {
        
        int min =0;
        int max=10;
                
        for (int i=0;i<10;i++){
            System.out.println(generarNumeroAleatorio(min,max));
        }
    }
    
    public static int generarNumeroAleatorio (int minimo, int maximo){
        
        return (int) Math.floor (Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}
