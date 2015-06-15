package com.zisal.pizzastore.impl.pizza;

import com.zisal.pizzastore.api.IPizza;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 10:29 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class ClamPizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("prepare clam");
    }

    @Override
    public void bake() {
        System.out.println("bake clam");
    }

    @Override
    public void cut() {
        System.out.println("cut clam");
    }

    @Override
    public void box() {
        System.out.println("box clam");
    }
}
