/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitobartoli;


public class Dipendente extends Thread {

    Bancone bancone = new Bancone();
    int numeroDipendenti;

    public Dipendente(Bancone bancone, int numeroDipendenti) {
        this.bancone = bancone;
        this.numeroDipendenti = numeroDipendenti;

    }

    @Override
    public void run() {
        while (numeroDipendenti > 0) {
            try {
                sleep((int) Math.random() * 9000); //tempo del consumo
                bancone.preleva();
            } catch (Exception e) {
            }
            numeroDipendenti--;
        }

    }

    
}
