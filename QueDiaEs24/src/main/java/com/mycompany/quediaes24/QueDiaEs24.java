/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quediaes24;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class QueDiaEs24 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        Mes[] meses = Mes.values();
        
        System.out.println("Escribe un numero de dias");
        int dias = sn.nextInt();
        
        for(int i=0;i<meses.length;i++){
            
            if(meses[i].getNumDias()==dias){
                System.out.println(meses[i].toString());
            }
            
        }
    }
}
