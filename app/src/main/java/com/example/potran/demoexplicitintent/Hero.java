package com.example.potran.demoexplicitintent;

import java.io.Serializable;

/**
 * Created by 15017167 on 13/5/2017.
 */

public class Hero implements Serializable{
    private String name;
    private int strength;
    private int technicalProwess;

    public String getName(){
        return name;
    }

    public int getStrength(){
        return strength;
    }
    public int getTechnicalProwess(){
        return technicalProwess;
    }
    public Hero(String name, int strength, int technicalProwess){
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }
}
