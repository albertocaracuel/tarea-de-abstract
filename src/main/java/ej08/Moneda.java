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
public class Moneda extends Azar {

    private int valor;

    public Moneda(int valor) {
        this.valor = valor;
    }

    @Override
    public int lanzar() {
        Random r = new Random();

        this.valor = r.nextInt(2 - 1 + 1) + 1;

        return this.valor;
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
