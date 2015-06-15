package com.zisal.pizzastore.impl.pizza.ny;

import com.zisal.pizzastore.base.APizza;
import com.zisal.pizzastore.impl.pizza.CheesePizza;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 11:26 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class NYCheesePizza extends APizza {


    @Override
    public String getName() {
        return "NY cheese pizza";
    }

    @Override
    public String getDough() {
        return "ny dough";
    }

    @Override
    public String getSauce() {
        return "ny sauce";
    }
}
