package com.zisal.starbuzz.impl.condiment;

import com.zisal.starbuzz.base.ABeverage;
import com.zisal.starbuzz.base.ACondimentDecorator;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 2:23 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class SteamedMilk extends ACondimentDecorator {

    ABeverage beverage;

    public SteamedMilk(ABeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(" ").concat("Steamed Milk");
    }

    @Override
    public double defaultCost() {
        return 0.10 + beverage.defaultCost();
    }
}
