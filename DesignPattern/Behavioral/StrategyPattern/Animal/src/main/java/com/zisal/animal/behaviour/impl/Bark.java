/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.animal.behaviour.impl;

import com.zisal.animal.behaviour.Sound;

/**
 *
 * @author Ladies Man
 */
public class Bark implements Sound{

    @Override
    public void makeSound() {
        System.out.println("Ough...ough...ough...!!!");
    }
    
}
