/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.ejb;

import javax.ejb.Local;

/**
 *
 * @author 31448471
 */
@Local
public interface StatelessChatInterface {

    void conect();

    public void disconnect();

    void say(String msg);
    
    
}
