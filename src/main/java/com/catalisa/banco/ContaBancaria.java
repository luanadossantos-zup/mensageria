package com.catalisa.banco;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void realizarTransacao(String tipo, double valor) {
        if (tipo.equals("saque") && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else if (tipo.equals("deposito")) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Operação inválida ou saldo insuficiente para saque de R$" + valor);
        }
    }

}
