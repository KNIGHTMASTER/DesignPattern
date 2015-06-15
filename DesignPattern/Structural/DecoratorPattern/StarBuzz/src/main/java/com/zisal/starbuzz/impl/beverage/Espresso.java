package com.zisal.starbuzz.impl.beverage;

import com.zisal.starbuzz.base.ABeverage;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 2:00 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class Espresso extends ABeverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double defaultCost() {
        return 1.99;
    }

}
