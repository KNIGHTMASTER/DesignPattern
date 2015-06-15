package com.zisal.starbuzz.impl.beverage;

import com.zisal.starbuzz.base.ABeverage;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 2:02 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class HouseBlend extends ABeverage {

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double defaultCost() {
        return 0.89;
    }

}
