/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_cesarnunez_juanmolina;

/**
 *
 * @author cesar
 */
public class admin extends usuario {

    private String usuario = "admin";
    
    public admin() {
    }

    public admin(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

    public admin(String contrasena) {
        super(contrasena);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
