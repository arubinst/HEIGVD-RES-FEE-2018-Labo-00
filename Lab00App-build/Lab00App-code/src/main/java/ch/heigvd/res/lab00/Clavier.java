/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author migue
 */
public class Clavier extends IInstrument{
    
    String color;
    
    public Clavier(){
        sound = "dayyyn";
        soundVolume = 2;
        color = "ivory";
    }
    
    String play(){
        return sound;
    }
    
    int getSoundVolume(){
        return soundVolume;
    }
    
    String getColor(){
        return color;
    }
    
}
