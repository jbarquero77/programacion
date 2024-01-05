/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validardni;

/**
 *
 * @author joseb
 */
public class ValidarDNI {

    public static void main(String[] args) {
        
        try {
            validarDNI ("73778531M");
            System.out.println("El DNI es correcto");
        }catch (DNIException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void validarDNI(String DNI) throws Exception {
        
        if(!(DNI.length()<8 && DNI.length()>=9)){
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }
        
        String parteNumerica = DNI.substring(0,DNI.length()-1);
        
        int numeroDNI=0;
        
        try{
            numeroDNI = Integer.parseInt(parteNumerica);
        }catch(NumberFormatException e){
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }
        
        char letra = DNI.substring(DNI.length()-1, DNI.length()).charAt(0);
        if (!(letra>='A' && letra <='Z')){
            throw new DNIException(DNIException.PARTE_LETRA_NO_CORRECTA);
        }
        
        
        final int DIVISOR = 23;
        
        char letraNIF[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N',
            'J','Z','S','Q','V','H','L','C','K','E'};
        int resto=numeroDNI % DIVISOR;
        String nuevoDNI = numeroDNI + "" + letraNIF[resto];
        
        if(!(nuevoDNI.equals(DNI))){
            throw new DNIException(DNIException.FORMATO_INCORRECT0);
    }
    }
}


