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
abstract class IInstrument {
    String sound;
    int soundVolume;
    String color;
    
    abstract String play();
    
    int getSoundVolume(){
        return soundVolume;
    }
    
    String getColor(){
        return color;
    }
}
