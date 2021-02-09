package Logica;

import Persistencia.PersistenceController;
import java.util.List;

public class Ferreteria {

    public Ferreteria() {
    }

    PersistenceController persistence = new PersistenceController();

    /**
     * **************** Usuarios ***********************
     */
    
    public List<Usuario> traerUsuario(){
        List<Usuario> listaUsuario = persistence.traerUsuarios();
        return listaUsuario;
    }
    public void crearUsuario(String usuario, String password) {
        Usuario usu = new Usuario();
        usu.setTipoUsuario(usuario);
        usu.setPassword(password);
        try {
            persistence.crearUsuario(usu);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    
    public boolean verficacionAcceso(String usuario, String password) {
        boolean permiso = false;
        List<Usuario> listUsuario = this.persistence.accederLogin();
        for (Usuario user : listUsuario) {
            if (user.getTipoUsuario().equals(usuario) && user.getPassword().equals(password)) {
                permiso = true;
                return permiso;
            }
        }
        return permiso;
    }
}
