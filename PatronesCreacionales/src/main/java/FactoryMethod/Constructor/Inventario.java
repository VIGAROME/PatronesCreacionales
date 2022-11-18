/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod.Constructor;

import FactoryMethod.ProductoElectronico;

/**
 *
 * @author garci
 */
public abstract class Inventario {
    public void addProduct(){
        ProductoElectronico producto= crearProduct();
               
    }

    private ProductoElectronico crearProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
