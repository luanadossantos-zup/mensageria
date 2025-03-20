package com.catalisa.concorrencia;

public class Main {

    public static void main(String[] args) {
        Contador contador = new Contador();

        Thread thread1 = new Thread(new TarefaIncremento(contador), "Thread-1");
        Thread thread2 = new Thread(new TarefaIncremento(contador), "Thread-2");
        Thread thread3 = new Thread(new TarefaIncremento(contador), "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
