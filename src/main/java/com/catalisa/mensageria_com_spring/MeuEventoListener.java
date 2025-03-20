package com.catalisa.mensageria_com_spring;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MeuEventoListener {

    //Consumidor
    @EventListener
    public void ouvirEvento(MeuEvento evento) {
        System.out.println("Evento recebido: " + evento.getMensagem());
    }
}
