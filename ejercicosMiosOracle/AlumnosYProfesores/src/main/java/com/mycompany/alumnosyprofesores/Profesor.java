/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosyprofesores;

/**
 *
 * @author joseb
 */
public class Profesor extends Persona {
    
    private String materia;
    
    public Profesor(){
        
        super();
        
        super.setEdad(MetodosSueltos.generarNumeroAleatorio(20, 50));
        
        materia=Constantes.MATERIAS[MetodosSueltos.generarNumeroAleatorio(0, 2)];
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    @Override
    public void disponibilidad (){
        int prob=MetodosSueltos.generarNumeroAleatorio(0,100);
        if (prob<20){
            super.setAsistencia (false);
        }else{
            super.setAsistencia (true);
        }
    }
    
}
