package com.catalisa.banco;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Criação da conta bancária
        ContaBancaria conta = new ContaBancaria(1000.00);

        // Criação do processador de transações
        ProcessadorDeTransacoes processador = new ProcessadorDeTransacoes();

        // Adiciona um listener para eventos de transação
        processador.adicionarListener(mensagem -> {
            System.out.println("Notificação: " + mensagem);
        });

        // ExecutorService para gerenciar concorrência
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(() -> processador.processarTransacao(conta, "saque", 200.00));
        executor.execute(() -> processador.processarTransacao(conta, "deposito", 500.00));
        executor.execute(() -> processador.processarTransacao(conta, "saque", 800.00));

        executor.shutdown();
    }
}
