/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author 31448471
 */
@Stateless
public class StatelessChat implements StatelessChatInterface {
    
    private String name = "Anonymous";

    @Override
    public void conect() {
        System.out.println(name+" entered the room!");
    }

    @Override
    public void disconnect() {
        System.out.println(name+" left the room");
    }

    @Override
    public void say(String msg) {
        System.out.println(name+" said: "+msg);
    }

    
    
    
}
