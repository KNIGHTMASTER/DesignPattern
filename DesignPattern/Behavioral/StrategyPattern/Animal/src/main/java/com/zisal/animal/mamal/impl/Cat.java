/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.animal.mamal.impl;

import com.zisal.animal.IAnimalConstant;
import com.zisal.animal.behaviour.Sound;
import com.zisal.animal.behaviour.impl.Meow;
import com.zisal.animal.mamal.AMamal;

/**
 *
 * @author Ladies Man
 */
public class Cat extends AMamal{

    @Override
    public Sound sound() {
        return new Meow();
    }

    @Override
    public String mamalName() {
        return IAnimalConstant.Mamal.CAT;
    }
    
}
