/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionempleados;

/**
 *
 * @author joseb
 */
public class GestionEmpleados {

    public static void main(String[] args) {
        
        Comercial c1 = new Comercial(300, "Jose", 46, 2400);
        Repartidor r1 = new Repartidor("zona 3", "Badcase", 21, 1200);

        //Llamamos a plus
        c1.plus();
        r1.plus();

        //Mostramos la informacion
        System.out.println(c1);
        System.out.println(r1);
    }
        
        
        
    
}
