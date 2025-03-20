package com.catalisa.threads;

public class MinhaThread extends Thread{

    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        // Código que será executado pela thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(nome + " está executando: " + i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println(nome + " foi interrompida.");
            }
        }
        System.out.println(nome + " terminou.");
    }
}
