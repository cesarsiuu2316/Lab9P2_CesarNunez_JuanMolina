/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_cesarnunez_juanmolina;

import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Hwan
 */
public class adminExamen implements Runnable{
    private int secs,mins,hrs = 0;
    private String notificacion ;
    private boolean estado = true; 
    private JLabel tiempo,notif;
    
    public adminExamen(JLabel tiempo, JLabel notif) {
        this.tiempo = tiempo;
        this.notif = notif;
    }

    public JLabel getNotif() {
        return notif;
    }

    public void setNotif(String texto) {
        notif.setText(texto);
    }
    
    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(String texto) {
        tiempo.setText(texto);
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
            for (hrs= 0; hrs < 60 ; hrs++) {
                for(mins=0; mins<60; mins++){
                    setNotif("Ya han pasado: "+mins+" minutos");
                    for(secs=0; secs<60;secs++){
                        String temp = String.format("%02d",hrs)+ ":" + String.format("%02d",mins) + ":" + String.format("%02d",secs);
                        setTiempo(temp);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            }
            
        }
    }
}


    
