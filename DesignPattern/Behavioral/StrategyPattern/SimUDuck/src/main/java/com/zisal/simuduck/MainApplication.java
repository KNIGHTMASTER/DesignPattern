/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.simuduck;

import com.zisal.simuduck.duck.ADuck;
import com.zisal.simuduck.duck.impl.Decoy;
import com.zisal.simuduck.duck.impl.Mallard;
import com.zisal.simuduck.duck.impl.RedHead;
import com.zisal.simuduck.duck.impl.Rubber;

/**
 *
 * @author Ladies Man
 */
public class MainApplication {

    public static void main(String[] args) {
        ADuck[] ducks = {new Mallard(), new Decoy(), new RedHead(), new Rubber()};

        for (ADuck duck : ducks) {
            duck.displayName();
            duck.performQuack();
            duck.performFly();
        }

    }
}
