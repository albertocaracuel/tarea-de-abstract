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
public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {

        double dimension = super.getAltura()*super.getBase();

        return dimension;
    }
}
