/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumdiaslaborables;

/**
 *
 * @author joseb
 */
public enum DiasSemana {
    LUNES (true),
    MARTES(true),
    MIERCOLES (true),
    JUEVES (true),
    VIERNES (true),
    SABADO (false),
    DOMINGO (false);
    
    private boolean laborable;
    
    private DiasSemana (boolean laborable){
        this.laborable = laborable;
        
    }
    
    public String toSting(){
        if(laborable){
            return "El día "+this.name().toLowerCase+" es laborable";
        }else{
            return "El día "+this.name().toLowerCase+" no es laborable";
        }
    }
}

