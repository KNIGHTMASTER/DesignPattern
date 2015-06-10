/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zisal.bankingnews.api.impl;

import com.zisal.bankingnews.api.IBankPublisher;
import com.zisal.bankingnews.api.INewsSubscriber;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ladies Man
 */
public class BankPublisher implements IBankPublisher{

    private String news;
    private List<INewsSubscriber> subscribers = new ArrayList<INewsSubscriber>();
    
    @Override
    public void registerSubscriber(INewsSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(INewsSubscriber subscriber) {
        int index = subscribers.indexOf( subscriber );
        if( index >= 0 ){
            subscribers.remove( subscriber );
        }
    }

    @Override
    public void notifySubscribers() {
        for( INewsSubscriber subscriber: subscribers ){
            subscriber.update(news);
        }
    }
        
    public void setNews( String news ){
        this.news = news;
        notifySubscribers();
    }
}
