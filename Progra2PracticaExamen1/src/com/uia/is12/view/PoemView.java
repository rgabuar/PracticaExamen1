/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.view;

import com.uia.is12.bussines.PoemBussines;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robby
 */
public class PoemView extends Thread{
    
    private PoemBussines poemBussines;
    
    public PoemView(){
        this.poemBussines = new PoemBussines();
    }
    
    public void run(){
        ArrayList<Verse> verse = poemBussines.getPoem().getVerse();
            
        for (Verse v: verse) {
            try {
                Thread.sleep(v.getReadingTime());
                System.out.println(v.getParagraph());
            } catch (InterruptedException ex) {
                Logger.getLogger(PoemView.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
    }
}
