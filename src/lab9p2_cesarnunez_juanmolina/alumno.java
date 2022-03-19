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
public class alumno extends usuario{
    private int idEstudiante;
    private String carrera;
    private ArrayList<clase> clases;

    public alumno() {
    }

    public alumno(int idEstudiante, String carrera) {
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
    }

    public alumno(int idEstudiante, String carrera, String nombre, String usuario, String contrasena) {
        super(nombre, contrasena);
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clase> clases) {
        this.clases = clases;
    }    
    
}
