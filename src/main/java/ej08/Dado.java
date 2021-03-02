/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08;

import java.util.Random;

/**
 *
 * @author alberto
 */
public class Dado extends Azar {

    private int valor;

    public Dado(int valor) {
        this.valor = valor;
    }

    @Override
    public int lanzar() {
        Random r = new Random();

        int valor = r.nextInt(6 - 1 + 1) + 1;

        return valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado{" + "valor=" + valor + '}';
    }

}
