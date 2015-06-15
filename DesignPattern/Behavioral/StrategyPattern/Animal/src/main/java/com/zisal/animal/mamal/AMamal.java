/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.animal.mamal;

import com.zisal.animal.behaviour.Sound;

/**
 *
 * @author Ladies Man
 */
public abstract class AMamal {
    
    public abstract Sound sound();
    
    public abstract String mamalName();
    
    public void run(){
        System.out.println(mamalName().concat(" is running"));
    }
    
    public void performSound(){
        sound().makeSound();
    }
}
