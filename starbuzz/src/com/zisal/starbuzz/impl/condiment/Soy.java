package com.zisal.starbuzz.impl.condiment;

import com.zisal.starbuzz.base.ABeverage;
import com.zisal.starbuzz.base.ACondimentDecorator;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 2:11 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class Soy extends ACondimentDecorator {

    ABeverage beverage;

    public Soy(ABeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(" Soy");
    }

    @Override
    public double defaultCost() {
        return 0.15 + beverage.defaultCost();
    }
}
