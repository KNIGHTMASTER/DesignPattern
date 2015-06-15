package com.zisal.pizzastore.impl.pizza;

import com.zisal.pizzastore.api.IPizza;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 10:28 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class PepperoniPizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("prepare pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("bake pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("cut pepperoni");
    }

    @Override
    public void box() {
        System.out.println("box pepperoni");
    }
}
