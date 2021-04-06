/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esmodificato;

/**
 *
 * @author Alessandro Bartoli
 */
public class EsModificato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Calcolo c = new Calcolo();
        
        Thread thr1 = new Thread(new Runnable()
        {
            public void run()
            {
                synchronized(this){
                    for (int i = 0; i < 100000; i++) 
                    {
                        c.increment();
                    }
                }
            }
        });
        
        Thread thr2 = new Thread(new Runnable()
        {
            public void run()
            {
                synchronized(this){
                    for (int i = 0; i < 100000; i++) 
                    {
                        c.decrement();
                    }
                }
            }
        });
        
        thr1.run();
        thr2.run();
        
        c.printFinalCounterValue();
        
       
        
    }
    
    
    
}
