/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej09;

/**
 *
 * @author alberto
 */
public abstract class Vehiculo {
    
    private int bastidor;
    
    public final void setBastidor(int bastidor){
        this.bastidor=bastidor;
        
    }
    
    public abstract int getVelocidad();
    
    //si puede tener desdencia solo q no heredan los atributos de la clase ni el constructor
    //si porque es una clase abstract
}
