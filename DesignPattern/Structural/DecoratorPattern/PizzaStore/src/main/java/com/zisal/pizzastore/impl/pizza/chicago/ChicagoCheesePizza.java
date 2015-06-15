package com.zisal.pizzastore.impl.pizza.chicago;

import com.zisal.pizzastore.base.APizza;
import com.zisal.pizzastore.impl.pizza.CheesePizza;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 11:28 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class ChicagoCheesePizza extends APizza {

    @Override
    public String getName() {
        return "Chicago cheese pizza";
    }

    @Override
    public String getDough() {
        return "chicago dough";
    }

    @Override
    public String getSauce() {
        return "chicago sauce";
    }
}
