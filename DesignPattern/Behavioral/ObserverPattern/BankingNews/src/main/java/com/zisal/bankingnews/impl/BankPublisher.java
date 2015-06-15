/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.bankingnews.impl;

import com.zisal.bankingnews.IBankPublisher;
import com.zisal.bankingnews.INewsSubscriber;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ladies Man
 */
public class BankPublisher implements IBankPublisher {

    private String news = null;
    private List<INewsSubscriber> subscribers = new ArrayList<INewsSubscriber>();

    @Override
    public void registerSubscriber(INewsSubscriber newsSubscriber) {
        subscribers.add(newsSubscriber);
    }

    @Override
    public void removeSubscriber(INewsSubscriber newsSubscriber) {
        int index = subscribers.indexOf(newsSubscriber);
        if (index >= 0) {
            subscribers.remove(index);
        }
    }

    @Override
    public void notifySubscriber() {
        if (news != null) {
            for (INewsSubscriber newsSubscriber : subscribers) {
                newsSubscriber.update(news);
            }
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifySubscriber();
    }

}
