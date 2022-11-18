/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import java.awt.Color;

/**
 *
 * @author garci
 */
public class Television implements ProductoElectronico{
    private String memoria;
    private String ram;
    private Color color;
    private String pulgadas;

    public Television(String memoria, String ram, Color color, String pulgadas) {
        this.memoria = memoria;
        this.ram = ram;
        this.color = color;
        this.pulgadas= pulgadas;
    }

    public Television() {
        this.memoria="1GB";
        this.ram = "500MB";
        this.color = new Color(255,255,255);
        this.pulgadas= "32''";
    }
    

    @Override
    public void OnProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void OfProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
