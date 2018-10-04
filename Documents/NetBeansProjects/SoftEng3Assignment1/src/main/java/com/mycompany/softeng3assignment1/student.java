/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3assignment1;

/**
 *
 * @author Joseph
 */
public class student {

    public long getId() {
        return Id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    private final long Id;
    private final int age;
    private final String name;
    private final String DOB;
   private final String username ;

    public String getUsername() {
      
        return username;
    }
    
    
    
    
    public student( String name, int age, String DOB, long Id)
    {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this. Id = Id;
        username = name + String.valueOf(age);
    } 
    
    
}
