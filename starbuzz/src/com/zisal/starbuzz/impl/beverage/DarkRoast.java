package com.zisal.starbuzz.impl.beverage;

import com.zisal.starbuzz.base.ABeverage;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 2:08 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class DarkRoast extends ABeverage {

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double defaultCost() {
        return 0.99;
    }

}
