/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maximocdyminomocm;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class MaximoCDyMinomoCM {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
                
        System.out.println("Dame el primer número");
        int num1 =sn.nextInt();
        
        System.out.println("Dame el segundo número");
        int num2 =sn.nextInt();
        
        int res=mcd(num1,num2);
        System.out.println("El MCD es "+res);
    }
    
    public static int mcd(int num1,int num2){
        int a=Math.max(num1, num2);
        int b=Math.min(num1,num2);
        
        int resultado=0;
        do{
            resultado=b;
            b=a%b;
            a=resultado;
            
        }while(b!=0);
        
        return resultado;
    }
    
    
}
