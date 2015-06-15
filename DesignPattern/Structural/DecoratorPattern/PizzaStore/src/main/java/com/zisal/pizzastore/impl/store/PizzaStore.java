package com.zisal.pizzastore.impl.store;

import com.zisal.pizzastore.api.IPizza;
import com.zisal.pizzastore.impl.factory.PizzaFactory;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 10:51 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class PizzaStore {

    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public IPizza orderPizza(String pizzaType){
        IPizza pizza = null;
        pizza = pizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
