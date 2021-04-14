/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esgaradicorsa;
import java.time.Clock;/**
 *
 * @author Alessandro Bartoli
 */
public class ConcorrenteThread extends Thread {
    private String nome;
    private Clock clock;
    private long partenza;
    private long arrivo;

    public String getNome() {
        return nome;
    }

    public Clock getClock() {
        return clock;
    }

    public long getPartenza() {
        return partenza;
    }

    public long getArrivo() {
        return arrivo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setPartenza(long partenza) {
        this.partenza = partenza;
    }

    public void setArrivo(long arrivo) {
        this.arrivo = arrivo;
    }
    
    
    
    public ConcorrenteThread(String nome){
        this.nome=nome;
        partenza=0;
        arrivo=0;
        
    }
    public void run(){
        partenza=clock.millis();    
        for(int i=0; i<101;i++){
            if(i==100){
                System.out.println(nome+"arrivato");
            }
        }
        arrivo=clock.millis()-partenza;
    }
    
    
}
