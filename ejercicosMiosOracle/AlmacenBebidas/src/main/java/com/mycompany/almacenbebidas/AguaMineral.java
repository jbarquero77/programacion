/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacenbebidas;

/**
 *
 * @author joseb
 */
public class AguaMineral extends Bebida{
    
    private String manantial;

    public AguaMineral(String manantial, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public String toString() {
        return super.toString() + "manantial=" + manantial + '}';
    }
   
    
    
}
