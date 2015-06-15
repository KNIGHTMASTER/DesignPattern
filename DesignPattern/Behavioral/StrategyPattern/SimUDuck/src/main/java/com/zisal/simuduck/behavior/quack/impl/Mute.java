/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.simuduck.behavior.quack.impl;

import com.zisal.simuduck.behavior.quack.IQuack;

/**
 *
 * @author Ladies Man
 */
public class Mute implements IQuack{

    @Override
    public void quack() {
        System.out.println("I don't quack");
    }
    
}
