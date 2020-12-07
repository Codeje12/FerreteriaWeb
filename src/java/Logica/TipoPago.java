package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoPago implements Serializable {
    @Id
    int id;
    String Descripcion;

    public TipoPago() {
    }

    public TipoPago(int id, String Descripcion) {
        this.id = id;
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
