package com.zisal.pizzastore.impl.pizza;

import com.zisal.pizzastore.api.IPizza;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 10:29 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class VeggiePizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("prepare veggie");
    }

    @Override
    public void bake() {
        System.out.println("bake veggie");
    }

    @Override
    public void cut() {
        System.out.println("cut veggie");
    }

    @Override
    public void box() {
        System.out.println("box veggie");
    }
}
