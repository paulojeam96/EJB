/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author 31448471
 */
@Singleton //Unico(uma instancia para todos os clientes)
@LocalBean //Não possui interface local
@WebListener //Ouvinte da sessão 
@Startup //Inicializa junto com a subida do servidor
public class SalaSingleton implements HttpSessionListener{
    
    private int cont = 0;
    
    //Chamado logo após a construção
    @PostConstruct
    private void init(){
        System.out.println("Sala criada");
    }
    
    //Chamado logo antes da destruição
    @PreDestroy
    private void close(){
        System.out.println("Sala fechada");
    }
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        cont++;
        System.out.println("Usuarios ativos: "+ cont);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        cont--;
        System.out.println("Usuarios ativos: "+cont);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
