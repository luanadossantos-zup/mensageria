package com.catalisa.threads;

public class Main {
    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("Thread 1");
        MinhaThread thread2 = new MinhaThread("Thread 2");

        // Inicia as threads
        thread1.start();
        thread2.start();
    }
}
