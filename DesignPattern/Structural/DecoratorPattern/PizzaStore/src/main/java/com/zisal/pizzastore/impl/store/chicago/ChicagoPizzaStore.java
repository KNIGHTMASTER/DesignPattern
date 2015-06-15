package com.zisal.pizzastore.impl.store.chicago;

import com.zisal.pizzastore.api.IConstant;
import com.zisal.pizzastore.api.IPizza;
import com.zisal.pizzastore.impl.factory.PizzaFactory;
import com.zisal.pizzastore.impl.pizza.chicago.ChicagoCheesePizza;
import com.zisal.pizzastore.impl.store.PizzaStore;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 11:30 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    @Override
    public IPizza orderPizza(String pizzaType) {
        IPizza pizza = null;
        if( pizzaType.equals(IConstant.CHEESE_PIZZA)){
            pizza = new ChicagoCheesePizza();
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
