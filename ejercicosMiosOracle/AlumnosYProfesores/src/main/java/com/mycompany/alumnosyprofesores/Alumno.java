/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosyprofesores;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author joseb
 */
public class Alumno extends Persona{
    
    private int nota;
    
    public Alumno (){
        super();
        nota= MetodosSueltos.generarNumeroAleatorio(0,10);
        
        super.setEdad(MetodosSueltos.generarNumeroAleatorio(12,15));
                     
                
    }
    

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public void disponibilidad (){
        int prob=MetodosSueltos.generarNumeroAleatorio(0,100);
        if (prob<50){
            super.setAsistencia (false);
        }else{
            super.setAsistencia (true);
        }
        
        
    }
    
    public String tostring(){
        return "Nombre: "+super.getNombre()+" , sexo: "+super.getSexo()+" ,nota: "+nota;
    }
    
}
