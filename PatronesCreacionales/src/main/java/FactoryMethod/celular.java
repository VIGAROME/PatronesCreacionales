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
public class celular implements ProductoElectronico{
    private String memoria;
    private String ram;
    private String procesador;
    private Color color;

    public celular(String memoria, String ram, String procesador, Color color) {
        this.memoria = memoria;
        this.ram = ram;
        this.procesador = procesador;
        this.color = color;
    }

    public celular() {
        this.memoria = "128GB";
        this.ram = "8GB";
        this.procesador = "8 nucleos";
        this.color = new Color( 255,10,5);
    }

    public String getMemoria() {
        return memoria;
    }

    public String getRam() {
        return ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public Color getColor() {
        return color;
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
