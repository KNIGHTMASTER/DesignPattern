/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zisal.reptiles;

import com.zisal.reptiles.api.IReptileConstant;
import com.zisal.reptiles.api.IReptiles;
import com.zisal.reptiles.api.impl.Lizard;
import com.zisal.reptiles.api.impl.Snake;

/**
 *
 * @author Ladies Man
 */
public class Reptiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IReptiles reptiles = null;
        String choosenReptile = "snake";
        if( choosenReptile.equals( IReptileConstant.SNAKE ) ){
            reptiles = new Snake();
        }
        System.out.print("First Instance : ");
        reptiles.creep();
        choosenReptile = "lizard";
        if( choosenReptile.equals( IReptileConstant.LIZARD )){
            reptiles = new Lizard();
        }
        System.out.print("Second Instance : ");
        reptiles.creep();
    }
    
}
