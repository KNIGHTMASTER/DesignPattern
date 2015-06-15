/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.bankingnews.impl;

import com.zisal.bankingnews.IBankPublisher;
import com.zisal.bankingnews.INewsSubscriber;

/**
 *
 * @author Ladies Man
 */
public class EmailBanking implements INewsSubscriber{

    private IBankPublisher bankPublisher;

    public EmailBanking(IBankPublisher bankPublisher) {
        this.bankPublisher = bankPublisher;
        bankPublisher.registerSubscriber(this);
    }
    
    
    @Override
    public void update(String news) {
        System.out.println("EMAIL BANKING ".concat(news));
    }
    
}
