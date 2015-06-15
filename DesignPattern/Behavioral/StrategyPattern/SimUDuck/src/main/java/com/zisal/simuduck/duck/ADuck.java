/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.simuduck.duck;

import com.zisal.simuduck.behavior.fly.IFly;
import com.zisal.simuduck.behavior.quack.IQuack;

/**
 *
 * @author Ladies Man
 */
public abstract class ADuck {
    
    protected abstract IQuack quack();
    
    protected abstract IFly fly();
    
    protected abstract String duckName();
    
    public void displayName(){
        System.out.println("My name is ".concat(duckName()));
    }
    
    public void performFly(){
        fly().fly();
    }
    
    public void performQuack(){
        quack().quack();
    }
}
