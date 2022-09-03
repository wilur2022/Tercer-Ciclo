package com.GrupoJoel.ProyectoCicloTres.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleados")
public class Empleados {
    //Atributos
    @Id
    private String idEmpleado;
    @Column
    private String nameEmpleado;
    @Column
    private String userEmpleado;
    @Column
    private String password;

    //Constructor con atributos
    public Empleados(String idEmpleado, String nameEmpleado, String userEmpleado, String password) {
        this.idEmpleado = idEmpleado;
        this.nameEmpleado = nameEmpleado;
        this.userEmpleado = userEmpleado;
        this.password = password;
    }
    //Constructor sin atributos
    public Empleados() {
    }

    //Getters and Setters

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNameEmpleado() {
        return nameEmpleado;
    }

    public void setNameEmpleado(String nameEmpleado) {
        this.nameEmpleado = nameEmpleado;
    }

    public String getUserEmpleado() {
        return userEmpleado;
    }

    public void setUserEmpleado(String userEmpleado) {
        this.userEmpleado = userEmpleado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
