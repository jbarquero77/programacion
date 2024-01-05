/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosyprofesores;

/**
 *
 * @author joseb
 */
public class MetodosSueltos {
    
    public static int generarNumeroAleatorio (int minimo, int maximo){
        
        int num =(int) Math.floor (Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
}


