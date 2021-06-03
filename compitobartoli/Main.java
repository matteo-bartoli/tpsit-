/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitobartoli;


public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws InterruptedException {
        
        Bancone bancone = new Bancone();
        Dipendente dipendente = new Dipendente(bancone, 5);
        
        dipendente.start();
        for (int i = 0; i < 5; i++) {
            Cuoco cuoco = new Cuoco(bancone);
            cuoco.start();
        }
        for (int i = 0; i < 5; i++) {
            Cuoco cuoco = new Cuoco(bancone);
            cuoco.join();
        }
        
        dipendente.join();
        System.out.println("Fine della pausa pranzo");
    }
    
    
}
