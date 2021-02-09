package Logica;

import javax.persistence.Entity;

@Entity
public class Rubro extends CheckBoxs{

    public Rubro() {
    }
    
    public Rubro(int id, String descripcion) {
        super(id, descripcion);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
