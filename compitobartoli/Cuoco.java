/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitobartoli;


public class Cuoco extends Thread {

    Bancone bancone = new Bancone();

    public Cuoco(Bancone bancone) {
        this.bancone = bancone;
    }

    @Override
    public void run() {
        try {

            sleep((int) Math.random() * 9000); //tempo per preparare il piatto

        } catch (Exception e) {
        }

        bancone.deposita();
    }
    
}
