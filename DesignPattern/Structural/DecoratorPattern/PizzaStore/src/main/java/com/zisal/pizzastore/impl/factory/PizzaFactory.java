package com.zisal.pizzastore.impl.factory;

import com.zisal.pizzastore.api.IConstant;
import com.zisal.pizzastore.api.IPizza;
import com.zisal.pizzastore.impl.pizza.CheesePizza;
import com.zisal.pizzastore.impl.pizza.ClamPizza;
import com.zisal.pizzastore.impl.pizza.PepperoniPizza;
import com.zisal.pizzastore.impl.pizza.VeggiePizza;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 10:30 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class PizzaFactory {

    public IPizza createPizza(String pizzaType){
        IPizza pizza = null;
        if( pizzaType.equals(IConstant.CHEESE_PIZZA)){
            pizza = new CheesePizza();
        }else if( pizzaType.equals(IConstant.CLAM_PIZZA)){
            pizza = new ClamPizza();
        }else if( pizzaType.equals(IConstant.PEPPERONI_PIZZA)){
            pizza= new PepperoniPizza();
        }else if( pizzaType.equals(IConstant.VEGGIE_PIZZA)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
