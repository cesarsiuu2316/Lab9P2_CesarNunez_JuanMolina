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
public class maestro extends usuario{
    private int idMaestro;

    public maestro() {
    }

    public maestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public maestro(int idMaestro, String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.idMaestro = idMaestro;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    @Override
    public String toString() {
        return super.toString() + "maestro{" + "idMaestro=" + idMaestro + '}';
    }
    
    
}


