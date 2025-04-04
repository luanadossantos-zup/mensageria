package com.catalisa.banco;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeTransacoes {
    private List<TransacaoListener> listeners = new ArrayList<>();


    public void adicionarListener(TransacaoListener listener) {
        listeners.add(listener);
    }

    private void notificarListeners(String mensagem) {
        for (TransacaoListener listener : listeners) {
            listener.onTransacaoConcluida(mensagem);
        }
    }

    public void processarTransacao(ContaBancaria conta, String tipo, double valor) {
        conta.realizarTransacao(tipo, valor);
        notificarListeners("Transação de " + tipo + " no valor de R$" + valor + " concluída.");
    }
}
