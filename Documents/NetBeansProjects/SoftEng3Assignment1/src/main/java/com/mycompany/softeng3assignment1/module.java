/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3assignment1;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class module {

    public String getModname() {
        return Modname;
    }

    public String getId() {
        return id;
    }

    private final String Modname;
    private final String id;
    private ArrayList<String> listStudents = new ArrayList();

    public ArrayList<String> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<String> listStudents) {
        this.listStudents = listStudents;
    }
    
    public module(String Modname, String id)
    {
        this.Modname = Modname;
        this.id = id;
    }
   
    public void addStudent(String username ,String name){
        listStudents.add(username + " "+  name); //adds student with their module to a list
    }
    
    public ArrayList<String> numStudentsPerModule(String name)
    {
        
        return  listStudents;
     
    }
}
