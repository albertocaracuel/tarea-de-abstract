/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

import java.util.Formatter;

/**
 *
 * @author alberto
 */
public class CuentaCorriente extends Cuenta {

    private double intere;
    private double saldoMin;

    public CuentaCorriente(double intere, double saldoMin, Formatter numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        this.intere = 1.5;
        this.saldoMin = saldoMin;
    }

    public double getIntere() {
        return intere;
    }

    public void setIntere(double intere) {
        this.intere = intere;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "intere=" + intere + ", saldoMin=" + saldoMin + '}';
    }

    @Override
    public double actualizarSaldo() {
        double act;
        if (super.getSaldo() > 1000) {
            act = super.getSaldo() + (this.saldoMin * this.intere);
        } else {
            act = super.getSaldo() + (super.getSaldo() + this.intere);
        }

        return act;
    }

    @Override
    public double retirar(double cantidad) {
        
        double acty = 0;
        acty= super.getSaldo()-cantidad;
        return acty;
        
        
        
    }

}
