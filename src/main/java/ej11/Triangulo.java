/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

/**
 *
 * @author alberto
 */
public class Triangulo extends Figura{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    
    public double calcularArea(double base, double altura) {
        double dimension = (base*altura)/2;
        
        return dimension;
    }

}