/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.bankingnews;

/**
 *
 * @author Ladies Man
 */
public interface IBankPublisher {
    
    public void registerSubscriber(INewsSubscriber newsSubscriber);
    
    public void removeSubscriber(INewsSubscriber newsSubscriber);
    
    public void notifySubscriber();
}
