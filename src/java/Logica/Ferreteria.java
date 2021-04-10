package Logica;

import Persistencia.PersistenceController;
import java.util.List;

public class Ferreteria {

    public Ferreteria() {
    }

    PersistenceController persistence = new PersistenceController();
    
    
    /**
     * ******Metodos/Funciones de imaginacion del Programador*********
     */
    public List<Object> tablaAdaptable(Object xobjeto) {
        List<Object> lista;
        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        try {
            if (xobjeto != null) {
                if (xobjeto.equals(cliente)) {
                    lista = this.persistence.traerClientes();
                    return lista;
                } else if (xobjeto.equals(producto)) {
                    lista = this.persistence.traerProductos();
                    return lista;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        }
        return null;
    }

    
    /**
     * ****************** Usuario***********************
     */
    public List<Usuario> traerUsuario() {
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

    public Usuario traerUsuarioUnico(String user) {
        Usuario usuario;
        try {
            usuario = this.persistence.traerUsuarioUnico(user);

            return usuario;
        } catch (Exception ex) {
            return null;
        }
    }

    public void getsavePhoto(String user, String fotoPerfil) {
        Usuario usuario = this.traerUsuarioUnico(user);
        String fp = "images/" + fotoPerfil;
        try {
            usuario.setFotoPerfil(fp);
            persistence.savePhoto(usuario);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    /**
     * **********Clientes****************
    */
    public List traerClientes() {
        List listaClientes;
        try {
            listaClientes = this.persistence.traerClientes();
            return listaClientes;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        }
    }

    /**
     * *****Productos*******
     */
    public List<Producto> traerProductos() {
         List listaProductos;
        try {
            listaProductos = this.persistence.traerProductos();
            return listaProductos;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        }
    }
}
