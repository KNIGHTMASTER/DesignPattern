package com.zisal.starbuzz.impl.condiment;

import com.zisal.starbuzz.base.ABeverage;
import com.zisal.starbuzz.base.ACondimentDecorator;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 2:03 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class Mocha extends ACondimentDecorator {

    ABeverage beverage;

    public Mocha(ABeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(" Mocha");
    }

    @Override
    public double defaultCost() {
        return 0.20 + beverage.defaultCost();
    }

}
