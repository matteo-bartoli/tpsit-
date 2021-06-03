/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitobartoli;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

public class Bancone {

    Semaphore pieno = new Semaphore(0);
    Semaphore vuoto = new Semaphore(1);
    
    private int numeroPiatto;
    
    public void deposita(){
        try {
            vuoto.acquire();
        } catch (Exception e) {
        }
        this.numeroPiatto++;
        System.out.println("Il piatto numero " + numeroPiatto + " è pronto.");
        pieno.release();
    }
    
    public void preleva() throws InterruptedException{
        try {
            pieno.acquire();
        } catch (Exception e) {
        }   
        System.out.println("Il piatto numero " + numeroPiatto + " è consumato.");
        vuoto.release();    
    }
    
}
