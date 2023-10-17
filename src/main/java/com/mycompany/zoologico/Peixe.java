/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author Lucas
 */
public class Peixe extends Animal{
    
    private String caracteristicas;
    
    public Peixe() {
        this.setNumPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas, Caudas";
             
}
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCaracterísticas: " + caracteristicas;
        return s;
    } 

    //gets e sets
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
       
    
    
    
    
           
    
}
