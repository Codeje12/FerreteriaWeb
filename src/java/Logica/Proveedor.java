package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proveedor implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    String empresa;
    Double pagoRealizado;
    
    public Proveedor() {
    }

    public Proveedor(int id, String empresa, Double pagoRealizado) {
        this.id = id;
        this.empresa = empresa;
        this.pagoRealizado = pagoRealizado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getPagoRealizado() {
        return pagoRealizado;
    }

    public void setPagoRealizado(Double pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }

}
