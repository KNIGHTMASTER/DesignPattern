/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.bankingnews;

import com.zisal.bankingnews.impl.BankPublisher;
import com.zisal.bankingnews.impl.EmailBanking;
import com.zisal.bankingnews.impl.SMSBanking;

/**
 *
 * @author Ladies Man
 */
public class MainApplication {
    
    public static void main(String [] args){
        BankPublisher bankPublisher = new BankPublisher();
        SMSBanking smsBanking = new SMSBanking(bankPublisher);
        EmailBanking emailBanking = new EmailBanking(bankPublisher);
        
        bankPublisher.setNews("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        bankPublisher.setNews("ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890");
    }
}
