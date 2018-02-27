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
public class Flute extends IInstrument{
    
    public Flute(){
        soundVolume = 1;
        sound = "";
    }
    
    @Override
    public String play(){
        return sound;
    }
    
    @Override
    public int getSoundVolume(){
        return soundVolume;
    }
}
