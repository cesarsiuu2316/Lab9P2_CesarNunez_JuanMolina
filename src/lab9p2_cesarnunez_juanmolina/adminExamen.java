/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_cesarnunez_juanmolina;

import java.util.Date;

/**
 *
 * @author Hwan
 */
public class adminExamen implements Runnable{
    private int secs,mins,hrs = 0;
    private String notificacion ;
    private boolean estado = true; 
    
    public adminExamen() {
    }

    public int getSecs() {
        return secs;
    }

    public void setSecs() {
        this.secs++;
    }

    public int getMins() {
        return mins;
    }

    public void setMins() {
        this.mins  ++;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs() {
        this.hrs ++;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion() {
        this.notificacion = "Ya han pasado: " + mins + "minutos";
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

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


    
