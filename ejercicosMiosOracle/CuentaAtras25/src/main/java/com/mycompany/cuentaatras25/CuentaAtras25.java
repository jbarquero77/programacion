/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentaatras25;

/**
 *
 * @author joseb
 */
public class CuentaAtras25 {

    public static void main(String[] args) throws InterruptedException {
        int horas=0, minutos=0, segundos=0;
        
        while(!(horas == 0 && minutos == 0 && segundos == 00)){
        
            if (horas <10){
                System.out.print("0"+horas);
            }else{
                System.out.print(horas);
            }
            
            System.out.print(":");
            
            if(minutos<0){
                System.out.print("0"+minutos);
            }else{
                System.out.print(minutos);
            }
            
            System.out.print(":");
            
            if (segundos<10){
                System.out.print("0"+segundos);
            }else{
                System.out.println(segundos);
            }
            System.out.print("");
            
            if (segundos == 0){
                
                if(minutos == 0){
                    horas--;
                    minutos = 59;
                    segundos =59;
                }else if (minutos !=0){
                    minutos --;
                    segundos = 59;
                }
                
            }else{
                segundos--;
            }
            
            Thread.sleep(1000);
            
            
        }
    }
}
