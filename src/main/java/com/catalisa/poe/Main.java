package com.catalisa.poe;

public class Main {
    public static void main(String[] args) {
        Botao botao = new Botao();

        // Registra o ouvinte do evento
        botao.setBotaoListener(() -> {
            // Ação executada quando o botão é clicado
            System.out.println("Evento capturado: O botão foi clicado!");
        });


        botao.clicar();
    }
}
