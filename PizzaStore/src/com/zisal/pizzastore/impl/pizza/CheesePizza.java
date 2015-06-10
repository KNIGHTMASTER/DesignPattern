package com.zisal.pizzastore.impl.pizza;

import com.zisal.pizzastore.api.IPizza;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 10:26 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class CheesePizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("prepare cheese");
    }

    @Override
    public void bake() {
        System.out.println("bake cheese");
    }

    @Override
    public void cut() {
        System.out.println("cut cheese");
    }

    @Override
    public void box() {
        System.out.println("box cheese");
    }
}
