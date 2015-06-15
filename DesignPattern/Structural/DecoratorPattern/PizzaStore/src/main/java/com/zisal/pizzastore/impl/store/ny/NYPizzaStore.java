package com.zisal.pizzastore.impl.store.ny;

import com.zisal.pizzastore.api.IConstant;
import com.zisal.pizzastore.api.IPizza;
import com.zisal.pizzastore.impl.factory.PizzaFactory;
import com.zisal.pizzastore.impl.pizza.ny.NYCheesePizza;
import com.zisal.pizzastore.impl.store.PizzaStore;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 11:29 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    @Override
    public IPizza orderPizza(String pizzaType) {
        IPizza pizza = null;
        if( pizzaType.equals(IConstant.CHEESE_PIZZA)){
            pizza = new NYCheesePizza();
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else{
            pizza = super.orderPizza(pizzaType);
        }
        return pizza;
    }
}
