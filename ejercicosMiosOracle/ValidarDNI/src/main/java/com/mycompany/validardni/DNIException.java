/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validardni;

/**
 *
 * @author joseb
 */
public class DNIException extends Exception{
    
    public static final String LONGITUD_NO_CORRECTA = "La longitud debe ser de 8 dígitos";
    public static final String PARTE_NUMERICA_NO_CORRECTA = "Introduce sólo los números";
    public static final String PARTE_LETRA_NO_CORRECTA = "Introduce sólo una letra"; 
    public static final String FORMATO_INCORRECT0 = "El DNI no tiene el formato adecuado"; 
    public DNIException(String mensaje){
        super(mensaje);
    }
}
