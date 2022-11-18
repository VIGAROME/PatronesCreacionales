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
public class Laptop implements ProductoElectronico{
    
    private String memoria;
    private String ram;
    private String procesador;
    private Color color;

    public Laptop(String memoria, String ram, String procesador, Color color) {
        this.memoria = memoria;
        this.ram = ram;
        this.procesador = procesador;
        this.color = color;
    }

    public Laptop() {
        this.memoria = "1TB";
        this.ram = "8GB";
        this.procesador = "4 nucleos, 2.3 GHZ";
        this.color = new Color( 255,255,255);
    }
    
    @Override
    public void OnProduct() {
        System.out.println("Se esta encendiendo la laptop");
    }

    @Override
    public void OfProduct() {
        System.out.println("La laptop se esta pagando");
    }
    
}
