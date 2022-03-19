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
    
    public admin() {
    }

    public admin(String usuario, String contrasena) {
        super(usuario, contrasena);
    }
    
    public admin(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
    }
        
}
