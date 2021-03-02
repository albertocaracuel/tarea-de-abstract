/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

import java.util.Formatter;
import java.util.Random;

/**
 *
 * @author alberto
 */
public abstract class Cuenta {

    private Formatter numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Formatter numeroCuenta, double saldo, Persona cliente) {
        this.numeroCuenta = crearVoletos();
        this.saldo = 0;
        this.cliente = cliente;
    }

    private Formatter crearVoletos() {
        Random random = new Random();
        long enteroAleatorio = random.nextInt(999999999 - 0 + 1) + 0;
        Formatter fmt = new Formatter();
        fmt.format("%020d", enteroAleatorio);
        return fmt;
    }

    public Formatter getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Formatter numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public abstract double actualizarSaldo();

    public abstract double retirar(double cantidad);
}
