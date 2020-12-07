package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Cliente extends Persona implements Serializable {
    
    Boolean cuenta;
    
    public Cliente() {
    }

    public Cliente(Boolean cuenta, int id, String nombre, String apellido, int dni, Date fecha) {
        super(id, nombre, apellido, dni, fecha);
        this.cuenta = cuenta;
    }

    public Boolean getCuenta() {
        return cuenta;
    }

    public void setCuenta(Boolean cuenta) {
        this.cuenta = cuenta;
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
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public Date getFecha() {
        return fecha;
    }

    @Override
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
