package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Venta implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    TipoPago tipo_pago;
    Date fechaCompra;
    Double total;
    
    @OneToMany
    List<Producto> producto;
    
    public Venta() {
    }

    public Venta(int id, List<Producto> producto, TipoPago tipo_pago, Date fechaCompra, Double total) {
        this.id = id;
        this.producto = producto;
        this.tipo_pago = tipo_pago;
        this.fechaCompra = fechaCompra;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public TipoPago getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(TipoPago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
