package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    String password;
    String tipoUsuario;
    String fotoPerfil;

    
    public Usuario() {
    }

    public Usuario(int id, String password, String tipoUsuario, String fotoPerfil) {
        this.id = id;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.fotoPerfil = fotoPerfil;
    }
    
    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
