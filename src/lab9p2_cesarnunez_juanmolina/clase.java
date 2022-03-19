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
public class clase {
    private String nombreClase;
    private int idClase,idMaestro;
    private ArrayList<examen> examenes;

    public clase() {
    }

    public clase(String nombreClase, int idClase, int idMaestro, ArrayList<examen> examenes) {
        this.nombreClase = nombreClase;
        this.idClase = idClase;
        this.examenes = examenes;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public ArrayList<examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<examen> examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "clase{" + "nombreClase=" + nombreClase + ", idClase=" + idClase + ", idMaestro=" + idMaestro + ", examenes=" + examenes + '}';
    }
}
