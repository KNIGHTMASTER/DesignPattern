/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zisal.bankingnews.api.impl;

import com.zisal.bankingnews.api.IBankPublisher;
import com.zisal.bankingnews.api.INewsSubscriber;

/**
 *
 * @author Ladies Man
 */
public class SMSBanking implements INewsSubscriber{

    private IBankPublisher bankPublisher;

    public SMSBanking(IBankPublisher bankPublisher) {
        this.bankPublisher = bankPublisher;
        bankPublisher.registerSubscriber(this);
    }
       
    @Override
    public void update(String news) {
        if( news.length()>30){
            news = news.substring(0, Math.min(30, news.length()));
        }
        System.out.println("SMS Banking : ".concat(news));
    }
    
}
