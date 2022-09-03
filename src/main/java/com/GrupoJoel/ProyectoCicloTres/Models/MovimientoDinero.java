package com.GrupoJoel.ProyectoCicloTres.Models;

import javax.persistence.*;

@Entity
@Table(name="MovimientoDinero")
public class MovimientoDinero {
    // Atributos
    @Id
    private String idMovimiento;
    @Column
    private int ingresos;
    @Column
    private int egresos;
    @OneToOne(mappedBy = "idEmpleado")
    private String idEmpleado;

    // Constructor con atributos

    public MovimientoDinero(String idMovimiento, int ingresos, int egresos, String idEmpleado) {
        this.idMovimiento = idMovimiento;
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.idEmpleado = idEmpleado;
    }


    // Constructor vacio sin atributos

    public MovimientoDinero() {

    }
    // Getters y Setters

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getEgresos() {
        return egresos;
    }

    public void setEgresos(int egresos) {
        this.egresos = egresos;
    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
