/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dataoutstream;

import java.io.DataOutputStream;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;


/**
 *guardar una serie de datos sobre los candidatos a un puesto de trabajo en un fichero binario. 
 * Debemos guardar lo siguiente: 
 * DNI, nombre, edad y expectativa salarial en ese orden. 
* Usa DataOutputStream
 * @author joseb
 */
public class DataOutStream {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter ("\n");
        sc.useLocale(Locale.US);
        
        boolean salir = false;
        
        do{
             try (DataOutputStream dos = new DataOutputStream(FileOutputStream("C:\\Users\\joseb\\OneDrive\\Escritorio\\ejercicios java\\candidatos.txt"))) {
                  System.out.println("Escribe el DNI");
                 String DNI = sc.next();

                 System.out.println("Escribe el nombre");
                 String nombre = sc.next();

                 System.out.println("Escribe la edad");
                 int edad = sc.nextInt();

                 System.out.println("Escribe el valor de la expectativa salarial");
                 double expectativaSalarial = sc.nextDouble();

           
                dos.writeUTF(DNI);

                dos.writeUTF(nombre);

                dos.writeInt(edad);

                dos.writeDouble(expectativaSalarial);
                
                 System.out.println("Candidato añadido");
            
            
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());

            }
        }while(!salir);
        
       
    }

    
}
