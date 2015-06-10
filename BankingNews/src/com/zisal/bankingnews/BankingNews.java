/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zisal.bankingnews;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 *
 * @author Ladies Man
 */
public class BankingNews {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        BankPublisher bankPublisher = new BankPublisher();
//        SMSBanking smsBanking = new SMSBanking(bankPublisher);
//        EmailBanking emailBanking = new EmailBanking(bankPublisher);
//        
//        bankPublisher.setNews("abcdefghijklmnopqrstuvwxyz1234567890");
        String a ="A";
        String b = "B";
        List<String> datas = new ArrayList<String>();
        datas.add(a);
        datas.add(b);
        System.out.println("DATA SIZE " + datas.size());
        
        for( Iterator<String> it = datas.iterator(); it.hasNext();){
            String string = it.next();
            System.out.println("STRING "+string);
            it.remove();            
        }
        
        System.out.println("DATA SIZE ke 2 " + datas.size());
        for( String data : datas ){
            System.out.println("DATA = "+data);
        }        
    }                
    
}
