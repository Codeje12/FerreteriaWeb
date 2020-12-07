package Persistencia;

import Logica.Usuario;
import java.util.List;

public class PersistenceController {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    ClassAbstractaJpaController cabsJpa = new ClassAbstractaJpaController();
    CompraJpaController compraJpa = new CompraJpaController();
    ProductoJpaController productoJPa = new ProductoJpaController();
    ProveedorJpaController proveedorJpa = new ProveedorJpaController();
    TipoPagoJpaController tipo_pagoJpa = new TipoPagoJpaController();
    TrabajadorJpaController trabajadorJpa = new TrabajadorJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
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
}
