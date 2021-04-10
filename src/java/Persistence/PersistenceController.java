package Persistencia;

import Logica.Usuario;
import Persistence.*;
import java.util.List;

public class PersistenceController {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    CompraJpaController compraJpa = new CompraJpaController();
    IvaJpaController ivaJpa = new IvaJpaController();
    MarcaJpaController marcaJpa = new MarcaJpaController();
    ProductoJpaController productoJpa = new ProductoJpaController();
    ProveedorJpaController proveedorJpa = new ProveedorJpaController();
    RubroJpaController rubroJpa = new RubroJpaController();
    TipoPagoJpaController tipo_pagoJpa = new TipoPagoJpaController();
    TrabajadorJpaController trabajadorJpa = new TrabajadorJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    UMedidaJpaController umedidaJpa = new UMedidaJpaController();
    VentaJpaController ventaJpa = new VentaJpaController();

    /**
     * *************Usuario****************
     */
    public void crearUsuario(Usuario usu) {
        try {
            usuarioJpa.create(usu);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    public List<Usuario> traerUsuarios() {
        try {
            List<Usuario> listaUsuario;
            listaUsuario = usuarioJpa.findUsuarioEntities();
            return listaUsuario;
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return null;
        }
    }

    public List<Usuario> accederLogin() {
        try {
            List<Usuario> listaUsuarios;
            listaUsuarios = usuarioJpa.findUsuarioEntities();
            return listaUsuarios;
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            return null;
        }
    }

    public Usuario traerUsuarioUnico(String user) {
        Usuario usuario;
        List<Usuario> listaUsuarios = this.usuarioJpa.findUsuarioEntities();
        for (Usuario usuarios : listaUsuarios) {
            if (usuarios.getTipoUsuario().equals(user)) {
                try {
                    usuario = usuarios;
                    return usuario;
                } catch (Exception ex) {
                    System.out.println("");
                    return null;
                }
            }
        }
        return null;
    }

    public void guardarFoto() {

    }

    public void savePhoto(Usuario usuario) {
        try {
            this.usuarioJpa.edit(usuario);
        } catch (Exception ex) {
            System.out.println("");

        }

    }

    public List traerClientes() {
        List listaClientes;
        try{
            listaClientes = this.clienteJpa.findClienteEntities();
            return listaClientes;
        }catch(Exception ex){
            System.out.println("Error: " + ex);
            return null;
        }
    }

    public List traerProductos() {
        List listaProductos;
        try{
            listaProductos = this.productoJpa.findProductoEntities();
            return listaProductos;
        }catch(Exception ex){
            System.out.println("Error: " + ex);
            return null;
        }
    }

}
