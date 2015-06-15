package com.zisal.pizzastore;

import com.zisal.pizzastore.api.IConstant;
import com.zisal.pizzastore.impl.factory.PizzaFactory;
import com.zisal.pizzastore.impl.store.PizzaStore;
import com.zisal.pizzastore.impl.store.chicago.ChicagoPizzaStore;
import com.zisal.pizzastore.impl.store.ny.NYPizzaStore;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 10:23 AM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class MainApplication {

    private static PizzaFactory pizzaFactory;
    private static PizzaStore chicagoPizzaStore, nyPizzaStore;

    public static void main( String [] args ){
        pizzaFactory = new PizzaFactory();
        chicagoPizzaStore = new ChicagoPizzaStore( pizzaFactory );
        nyPizzaStore = new NYPizzaStore( pizzaFactory );
        chicagoPizzaStore.orderPizza(IConstant.CHEESE_PIZZA);
        System.out.println("================================");
        nyPizzaStore.orderPizza(IConstant.CHEESE_PIZZA);
        System.out.println("================================");
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza(IConstant.CHEESE_PIZZA);
        System.out.println("================================");
        pizzaStore.orderPizza(IConstant.CLAM_PIZZA);
        System.out.println("================================");
        pizzaStore.orderPizza(IConstant.PEPPERONI_PIZZA);
        System.out.println("================================");
        pizzaStore.orderPizza(IConstant.VEGGIE_PIZZA);

    }
}
