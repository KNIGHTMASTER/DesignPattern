package com.zisal.customiodecorator;

import com.zisal.customiodecorator.impl.LowerCaseInputStream;

import java.io.*;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 3:11 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class MainApplication {

    String res = String.valueOf(getClass().getResource("com/zisal/customiodecorator/base/tes.txt"));

    public static void main( String [] args){
        int c = 0;
        try {
            InputStream is = new LowerCaseInputStream( new BufferedInputStream( new FileInputStream("com//zisal//customiodecorator//base//tes.txt")));
            while ((c = is.read()) >=0 ){
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
