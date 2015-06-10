package com.zisal.pizzastore.impl.toppings;

/**
 * Created by Achmad Fauzi on 4/8/2015 : 3:17 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class Topping {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "size=" + size +
                '}';
    }
}
