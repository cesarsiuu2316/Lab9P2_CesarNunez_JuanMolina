/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_cesarnunez_juanmolina;

/**
 *
 * @author Hwan
 */
public class adminExamen implements Runnable{
    private int tiempo,puntaje;
    private String notificacion;
    private boolean estado = true; 
    
    @Override
    public void run(){
        while(estado){
           

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}


    
