/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08;

/**
 *
 * @author alberto
 */
public abstract class Azar {
    
    private int posibilades;
    
    public abstract int lanzar();

    public int getPosibilades() {
        return posibilades;
    }

    public void setPosibilades(int posibilades) {
        this.posibilades = posibilades;
    }
    
}
