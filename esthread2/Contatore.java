package com.mycompany.esthread2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Contatore implements Runnable{
    public boolean incrementa;
    public static int contatore;

    Contatore(boolean incrementa) {
        this.incrementa=incrementa;
    }

    @Override
    public void run() {

        
        if(incrementa){
            contatore++;
        }else{
            contatore--;
        }
    }
    
    
    
}
