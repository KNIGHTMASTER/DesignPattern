package com.zisal.pizzastore.base;

import com.zisal.pizzastore.api.IPizza;
import com.zisal.pizzastore.impl.toppings.Topping;

import java.util.ArrayList;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 3:14 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public abstract class APizza implements IPizza{

    public String name;
    public String dough;
    public String sauce;
    public ArrayList<Topping> toppings = new ArrayList<Topping>();

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getDough();

    public void setDough(String dough) {
        this.dough = dough;
    }

    public abstract String getSauce();

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing...".concat(getName()));
        System.out.println("Tossing dough...".concat(getDough()));
        System.out.println("Adding sauce...".concat(getSauce()));
        System.out.println("Adding toppings");
        for( Topping topping : getToppings() ){
            System.out.println(" ".concat(topping.toString()));
        }
    }

    @Override
    public void bake() {
        System.out.println("bake for 25 minutes at 350");
    }

    @Override
    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    @Override
    public void box() {
        System.out.println("place pizza in official Pizza store box");
    }
}
