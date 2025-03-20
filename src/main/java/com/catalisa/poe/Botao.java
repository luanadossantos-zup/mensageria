package com.catalisa.poe;

public class Botao {
    private BotaoListener listener;

    //Injecao de comportamento
    public void setBotaoListener(BotaoListener listener) {
        this.listener = listener;
    }

    public void clicar() {
        System.out.println("Botão foi clicado!");
        if (listener != null) {
            listener.onBotaoClicado(); // Dispara o evento
        }
    }
}
