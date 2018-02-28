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
public class Harmonica extends IInstrument{
    
    public Harmonica(){
        sound = "dap dap";
    }
    
    @Override
    public String play(){
        return sound;
    }
}
