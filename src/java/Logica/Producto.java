package Logica;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Producto implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id        
    int id;
    
    String nombreProducto;
    int stock;
    Date fechaIngreso;
    Double precioCosto;
    Double precioVenta;
    String descripcion;
    
    
    @OneToOne
    ClassAbstracta marca;
    ClassAbstracta rubro;
    ClassAbstracta iva;
    ClassAbstracta uMedida;
    Proveedor proveedor;

    public Producto() {
    }

    public Producto(int id, String nombreProducto, int stock, Date fechaIngreso, Double precioCosto, Double precioVenta, String descripcion, ClassAbstracta marca, ClassAbstracta rubro, ClassAbstracta iva, ClassAbstracta uMedida, Proveedor proveedor) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.fechaIngreso = fechaIngreso;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.descripcion = descripcion;
        this.marca = marca;
        this.rubro = rubro;
        this.iva = iva;
        this.uMedida = uMedida;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ClassAbstracta getMarca() {
        return marca;
    }

    public void setMarca(ClassAbstracta marca) {
        this.marca = marca;
    }

    public ClassAbstracta getRubro() {
        return rubro;
    }

    public void setRubro(ClassAbstracta rubro) {
        this.rubro = rubro;
    }

    public ClassAbstracta getIva() {
        return iva;
    }

    public void setIva(ClassAbstracta iva) {
        this.iva = iva;
    }

    public ClassAbstracta getuMedida() {
        return uMedida;
    }

    public void setuMedida(ClassAbstracta uMedida) {
        this.uMedida = uMedida;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

}
