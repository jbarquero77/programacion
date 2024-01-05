/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosyprofesores;

/**
 *
 * @author joseb
 */
public abstract class Persona {
    
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;
    
    private final String[] NOMBRES_MASCULINOS={"Jose","Carlos","Juan","Pedro","Pablo"};
    private final String[] NOMBRES_FEMENINOS={"Ana","Clara","Marta","Esther","Sonia"};
    
    public Persona(){
        
        int definir_sexo=MetodosSueltos.generarNumeroAleatorio(0, 1);
        
        if (definir_sexo==0){
            nombre=NOMBRES_MASCULINOS[MetodosSueltos.generarNumeroAleatorio(0, 4)];
            sexo='H';
        }else{
            nombre=NOMBRES_FEMENINOS[MetodosSueltos.generarNumeroAleatorio(0, 4)];
            sexo='M';
        }
     
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    
    
    public abstract void disponibilidad();
    
    
    
}
