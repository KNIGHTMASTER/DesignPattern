package com.zisal.starbuzz.base;

import com.zisal.starbuzz.api.IConstant;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 1:58 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public abstract class ABeverage {

    private String description = "Unknown beverage";

    protected int size;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double defaultCost();

    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPaidCost(){
        if( getSize() == IConstant.TALL ){
            return defaultCost() * 3;
        }else if( getSize() == IConstant.GRANDE ){
            return defaultCost() * 2;
        }else{
            return defaultCost();
        }
    }

}
