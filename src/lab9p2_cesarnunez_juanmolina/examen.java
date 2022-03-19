/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_cesarnunez_juanmolina;

import java.util.ArrayList;

/**
 *
 * @author Hwan
 */
public class examen {
    private ArrayList<preguntas> examen;
    private int nota,idExamen;

    public examen() {
    }

    public examen(int idExamen) {
        this.idExamen = idExamen;
    }
    
    

    public examen(ArrayList<preguntas> examen) {
        this.examen = examen;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }
    
    public ArrayList<preguntas> getExamen() {
        return examen;
    }

    public void setExamen(ArrayList<preguntas> examen) {
        this.examen = examen;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return ""+idExamen;
    }
    
    
    
    
}
