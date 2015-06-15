/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zisal.reptilesfactory;


import com.zisal.reptilesfactory.api.IReptileConstant;
import com.zisal.reptilesfactory.api.IReptiles;
import com.zisal.reptilesfactory.api.impl.Lizard;
import com.zisal.reptilesfactory.api.impl.Snake;

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
