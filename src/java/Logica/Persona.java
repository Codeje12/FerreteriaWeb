package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)//TABLE_PER_CLASS,JOINED,SINGLE_TABLE
@Entity
public abstract class Persona implements Serializable {
    @Id
    int id;
    String nombre;
    String apellido;
    int dni;
    Date fecha;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, int dni, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
