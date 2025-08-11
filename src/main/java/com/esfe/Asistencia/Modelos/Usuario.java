package com.esfe.Asistencia.Modelos;

import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@NotBlank(message = "El nombre de usuario es requerido")
private String Login;

@NotBlank(message = "La clave es requerida")
private String Clave;

private int Status;
@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name = "usuario_rol",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "rol_id"))  
private List<Rol> roles;

public Integer getId() {
        return id;
    }

    public void setId(Integer Pid) {
        id = Pid;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> Roles) {
        roles = Roles;
    }
}
