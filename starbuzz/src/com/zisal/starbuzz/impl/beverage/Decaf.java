package com.zisal.starbuzz.impl.beverage;

import com.zisal.starbuzz.base.ABeverage;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 2:22 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class Decaf extends ABeverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double defaultCost() {
        return 1.05;
    }
}
