/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.simuduck.duck.impl;

import com.zisal.simuduck.ISimUDuckConstant;
import com.zisal.simuduck.behavior.fly.IFly;
import com.zisal.simuduck.behavior.fly.impl.FlyAble;
import com.zisal.simuduck.behavior.quack.IQuack;
import com.zisal.simuduck.behavior.quack.impl.Squeak;
import com.zisal.simuduck.duck.ADuck;

/**
 *
 * @author Ladies Man
 */
public class RedHead extends ADuck{

    @Override
    protected IQuack quack() {
        return new Squeak();
    }

    @Override
    protected IFly fly() {
        return new FlyAble();
    }

    @Override
    protected String duckName() {
        return ISimUDuckConstant.DuckName.RED_HEAD;
    }
    
}
