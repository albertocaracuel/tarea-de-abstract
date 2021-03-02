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
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, Formatter numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

    @Override
    public double actualizarSaldo() {
        double act = super.getSaldo() + (super.getSaldo() * this.interes);
        return act;
    }

    @Override
    public double retirar(double cantidad) {
        double acty = 0;
        if (super.getSaldo() >= 0) {
            acty= super.getSaldo()-cantidad;
        }else{
            System.out.println("No hay saldo oara retirar");
        }
        return acty;
    }

}
