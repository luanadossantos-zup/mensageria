package com.catalisa.mensageria_com_spring;

import org.springframework.context.ApplicationEvent;

public class MeuEvento extends ApplicationEvent {
    private String mensagem;

    public MeuEvento(Object source, String mensagem) {
        super(source);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
