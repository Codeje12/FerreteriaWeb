package Persistencia;

import Logica.Usuario;
import Persistence.*;
import java.util.List;

public class PersistenceController {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    CompraJpaController compraJpa = new CompraJpaController();
    IvaJpaController ivaJpa = new IvaJpaController();
    MarcaJpaController marcaJpa = new MarcaJpaController();
    ProductoJpaController productoJPa = new ProductoJpaController();
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
}
