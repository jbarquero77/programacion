/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseb
 */
public class Persona {
    
    
    private String nombre;
    private char sexo;
    private int edad;
    
    private final String[] NOMBRES_CHICOS={"jose","carlos","oscar","nacho","pedro"};
    private final String[] NOMBRES_CHICAS={"ana","clara","marta","sonia","maria"};
    
    
    
    public Persona(){
        
        int determinar_sexo=MetodosSueltos.generarNumeroAleatorio(0,1);
        
        
        
        nombre=NOMBRE_CHICOS[MetodosSueltos.generaNumeroAleatorio(0,4)];
        
    }
    
    
    
}
