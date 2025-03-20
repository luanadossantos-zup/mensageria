package com.catalisa.mensageria_com_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MeuEventoPublisher {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publicarEvento(String mensagem) {
        System.out.println("Publicando evento...");
        MeuEvento evento = new MeuEvento(this, mensagem);
        eventPublisher.publishEvent(evento);
    }
}
