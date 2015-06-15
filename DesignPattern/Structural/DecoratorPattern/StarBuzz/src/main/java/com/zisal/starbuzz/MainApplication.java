package com.zisal.starbuzz;

import com.zisal.starbuzz.api.IConstant;
import com.zisal.starbuzz.base.ABeverage;
import com.zisal.starbuzz.impl.beverage.DarkRoast;
import com.zisal.starbuzz.impl.beverage.Decaf;
import com.zisal.starbuzz.impl.beverage.Espresso;
import com.zisal.starbuzz.impl.beverage.HouseBlend;
import com.zisal.starbuzz.impl.condiment.Mocha;
import com.zisal.starbuzz.impl.condiment.Soy;
import com.zisal.starbuzz.impl.condiment.SteamedMilk;
import com.zisal.starbuzz.impl.condiment.Whip;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 1:57 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class MainApplication {

    public static void main( String [] args ){
        ABeverage beverage = new Espresso();
        beverage.setSize(IConstant.GRANDE);
        System.out.println(beverage.getDescription().concat(" $").concat(String.valueOf(beverage.getPaidCost())));

        ABeverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2.setSize(IConstant.GRANDE);
        System.out.println(beverage2.getDescription().concat(" $").concat(String.valueOf(beverage2.getPaidCost())));

        ABeverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3.setSize(IConstant.TALL);
        System.out.println(beverage3.getDescription().concat(" $").concat(String.valueOf(beverage3.getPaidCost())));

        ABeverage beverage4 = new Decaf();
        beverage4 = new SteamedMilk(beverage4);
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4.setSize(IConstant.TALL);
        System.out.println(beverage4.getDescription().concat(" $").concat(String.valueOf(beverage4.getPaidCost())));

        double totalCost = beverage.getPaidCost() + beverage2.getPaidCost() + beverage3.getPaidCost() + beverage4.getPaidCost();
        System.out.println("Total defaultCost for your beverage $" + totalCost);
    }
}
