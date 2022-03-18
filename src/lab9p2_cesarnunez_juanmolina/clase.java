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
    private int idClase,idMaestro,idExamen1,idExamen2;
    private ArrayList<examen> examenes;

    public clase() {
    }

    public clase(String nombreClase, int idClase, int idMaestro, int idExamen1, int idExamen2, ArrayList<examen> examenes) {
        this.nombreClase = nombreClase;
        this.idClase = idClase;
        this.idMaestro = idMaestro;
        this.idExamen1 = idExamen1;
        this.idExamen2 = idExamen2;
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

    public int getIdExamen1() {
        return idExamen1;
    }

    public void setIdExamen1(int idExamen1) {
        this.idExamen1 = idExamen1;
    }

    public int getIdExamen2() {
        return idExamen2;
    }

    public void setIdExamen2(int idExamen2) {
        this.idExamen2 = idExamen2;
    }

    public ArrayList<examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<examen> examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "clase{" + "nombreClase=" + nombreClase + ", idClase=" + idClase + ", idMaestro=" + idMaestro + ", idExamen1=" + idExamen1 + ", idExamen2=" + idExamen2 + ", examenes=" + examenes + '}';
    }
}
