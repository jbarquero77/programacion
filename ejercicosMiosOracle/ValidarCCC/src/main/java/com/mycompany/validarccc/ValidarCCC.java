/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validarccc;

/**
 *
 * @author joseb
 */
public class ValidarCCC {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public void validarCCC (String CCC)throws Exception{
        
        if (CCC.length()!=20){
            throw new Exception("La longitud debe ser de 20 dígitos");
        }
        
        String mensajeError="";
        String aux;
        String ent_of;
        String numeros_cuenta;
        String digito_control_resultado;
        int digito_ent_of, digito_num_cuenta;
        
        
        for (int i=0;i<4;i++){
            try{
                switch (i){
                    case 0: //entidad
                        aux = CCC.substring(0,4);
                        mensajeError = "Los dígitos de la entidad no son números";
                        Integer.parseInt(aux);
                        break;
                    case 1: //oficina
                        aux = CCC.substring(4,8);
                        mensajeError = "Los dígitos de la oficina no son números";
                        Integer.parseInt(aux);
                        break;
                    case 2: //digito control
                        aux = CCC.substring (8,10);
                        mensajeError ="Los dígitos de control no son números";
                        Integer.parseInt(aux);
                        
                        ent_of ="00"+CCC.substring(0,8);
                        numeros_cuenta=CCC.substring(10,20);
                        
                        digito_ent_of = obtenerDigitoControl(ent_of);
                        digito_num_cuenta = obtenerDigitoControl(numeros_cuenta);
                        
                        digito_control_resultado=String.valueOf(digito_ent_of);
                        
                        if(digito_control_resultado.equals(aux)){
                            mensajeError ="Los dígitos e ocntrol no coinciden";
                            throw new Exception (mensajeError);
                        }
                            
                            
                        }
                        break;
                    case 3: //número de cuenta
                        aux=CCC.substring(10,20);
                        mensajeError ="Los dígitos del número de  cuentano són números";
                        Integer.parseInt(aux);
                        break;
                }
            } catch (NumberFormatException e){
                throw new Exception(mensajeError);
         }
    
    
    public static int obtenerDigitoControl (String valor_cuenta){
        
        int[] factores ={1,2,4,8,5,10,9,7,3,6};
        int digito_control=0;
        
        int digito_cuenta;
        for (int i=0; i<valor_cuenta.length();i++){
            digito_cuenta = Integer.parseInt(String.valueOf(valor_cuenta.charAt(i)));
            digito_control += digito_cuenta * factores[i];
        }
        
        digito_control= 11 -(digito_control % 11);
        if (digito_control ==1){
            digito_control =0;
        }else if (digito_control ==10){
            digito_control =1;
        }
        return digito_control;
    }
}
