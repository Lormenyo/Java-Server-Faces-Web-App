/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.overtime.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hannah
 */
@ManagedBean
@RequestScoped
public class Home {
    
    private String userName = "";

    /**
     * Creates a new instance of Home
     */
    public Home() {
        System.out.println("Created GreetingsBean instance...");
    }
    
    
    public String getUserName() {
        return this.userName.trim();
    }
     
    public void setUserName(String userName) {
        this.userName = userName.trim();
    }
     
    public String greetUser() {
        return "greeting";
    }
    
}


