/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zisal.reptilesfactory.api.impl;

import com.zisal.reptilesfactory.api.IReptiles;

/**
 *
 * @author Ladies Man
 */
public class Snake implements IReptiles {

    @Override
    public void creep() {
        System.out.println("Snake creeps using stomach");
    }
    
}
