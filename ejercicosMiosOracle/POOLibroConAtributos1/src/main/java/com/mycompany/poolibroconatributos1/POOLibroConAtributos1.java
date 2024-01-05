/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poolibroconatributos1;

/**
 *
 * @author joseb
 */
public class POOLibroConAtributos1 {

    public static void main(String[] args) {
        
        Libro libro1=new Libro(11111, "Dracula", "Bram Stoker", 250);
        Libro libro2=new Libro (12131, "El Quijote", "Cervantes", 1870);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        
        
        if(libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo()+ " tiene más páginas");
            
        }else{
            System.out.println(libro2.getTitulo()+ " tiene más páginas");
        }
    }
}
