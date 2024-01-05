/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumdiaslaborables;

import static enumdiaslaborables.DiasSemana.LUNES;
import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class EnumDiasLaborables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();
        
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
        
        System.out.println(diaS.toSting());
       
        }
    }
    

