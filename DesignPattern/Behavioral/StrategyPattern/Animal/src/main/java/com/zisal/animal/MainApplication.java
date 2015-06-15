/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.animal;

import com.zisal.animal.mamal.AMamal;
import com.zisal.animal.mamal.impl.Cat;
import com.zisal.animal.mamal.impl.Dog;

/**
 *
 * @author Ladies Man
 */
public class MainApplication {
    
    public static void main(String [] args){
        AMamal mamal = new Dog();
        mamal.performSound();
        mamal.run();
        
        mamal = new Cat();
        mamal.performSound();
        mamal.run();
    }
}
