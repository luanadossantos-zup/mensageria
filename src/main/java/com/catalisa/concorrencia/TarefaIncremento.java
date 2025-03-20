package com.catalisa.concorrencia;

public class TarefaIncremento implements Runnable{
    private Contador contador;

    public TarefaIncremento(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // Cada thread incrementa 5 vezes
            contador.incrementar();
            try {
                Thread.sleep(100); // Simula algum processamento
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
