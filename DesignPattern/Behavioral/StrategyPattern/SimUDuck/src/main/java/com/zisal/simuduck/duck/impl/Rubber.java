/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.simuduck.duck.impl;

import com.zisal.simuduck.ISimUDuckConstant;
import com.zisal.simuduck.behavior.fly.IFly;
import com.zisal.simuduck.behavior.fly.impl.FlyNoWay;
import com.zisal.simuduck.behavior.quack.IQuack;
import com.zisal.simuduck.behavior.quack.impl.Quack;
import com.zisal.simuduck.duck.ADuck;

/**
 *
 * @author Ladies Man
 */
public class Rubber extends ADuck{

    @Override
    protected IQuack quack() {
        return new Quack();
    }

    @Override
    protected IFly fly() {
        return new FlyNoWay();
    }

    @Override
    protected String duckName() {
        return ISimUDuckConstant.DuckName.RUBBER;
    }
    
}
