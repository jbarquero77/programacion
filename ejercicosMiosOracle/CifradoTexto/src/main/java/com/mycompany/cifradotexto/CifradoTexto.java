/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cifradotexto;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class CifradoTexto {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        sn.useDelimiter("\n");
        
        String letras ="ABCDEFGHIJKLMNÑOPQRSTUVWYZ";
        
        System.out.println("Escribe una frase");
        String frase = next();
    }
    
    
    public static String codificar (String letras, String texto){
        String textoCodificado ="";
        
        texto = texto.toUpperCase();
        
        char caracter;
        for (int i=0;i<texto.length();i++){
            caracter=texto.charAt(i);
            
            int pos = letras.indexOf(caracter);
            if (pos == -1){
                textoCodificado+=caracter;
            }else{
                textoCodificado+=letras.charAt((pos+3)%letras.length()); 
            }
            return textoCodificado;
        }
      public static String descodificar(String letras, String texto){
          String textoDescodificado ="";
        
        texto = texto.toUpperCase();
        
        char caracter;
        for (int i=0;i<texto.length();i++){
            caracter=texto.charAt(i);
            
            int pos = letras.indexOf(caracter);
            if (pos == -1){
                textoDescodificado+=caracter;
            }else{
                if(pos-3<0){
            textoDescodificado+=letras.charAt(letras.length()+(pos-3)); 
            }else{
                    textoDecodificado +=letras.charAt ((pos-3)%letras.length());
                }
            return textoDescodificado;
      
        }
    }
 }
