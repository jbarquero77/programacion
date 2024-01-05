/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseb
 */
public class RelojDigital {

    public static void main(String[] args) throws InterruptedException {
            
        int horas = 0, minutos = 0, segundos = 0;

        while (true) {

            //Mostrar
            //Si es menor que 10, escribimos un cero delante
            if (horas < 10) {
                System.out.print("0");
            }

            System.out.print(horas + ":");

            if (minutos < 10) {
                System.out.print("0");
            }

            System.out.print(minutos + ":");

            if (segundos < 10) {
                System.out.print("0");
            }

            //salto de linea
            System.out.println(segundos);

            //Aumentar tiempo
            segundos++;

            //Comprobar tiempo
            if (segundos == 60) {
                //reinicio segundos
                segundos = 0;
                //aumento los minutos
                minutos++;
                if (minutos == 60) {
                    //Reinicio minutos
                    minutos = 0;
                    //Aumento horas
                    horas++;
                    if (horas == 24) {
                        //Reinicio horas
                        horas = 0;
                    }
                }
            }

            Thread.sleep(1000);

        }

}
}