package com.catalisa.concorrencia;

public class Contador {
    private int valor = 0;


    public synchronized void incrementar() {
        valor++;
        System.out.println(Thread.currentThread().getName() + " incrementou o contador para: " + valor);
    }

    public int getValor() {
        return valor;
    }
}
