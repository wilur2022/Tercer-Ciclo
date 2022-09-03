package com.GrupoJoel.ProyectoCicloTres.Service;

import com.GrupoJoel.ProyectoCicloTres.Models.Empleados;

import java.util.List;

public interface EmpleadoManagerInterface {
    public List<Empleados> getEmpleadoX();
    public  Empleados getOnlyEmpleado(String idEmpleado) throws Exception;
    public String setCreateEmpleado(Empleados EmpleadoX);
    public Empleados UpdateEmpleadoAll(Empleados EmpleadoX) throws Exception;
    public String DeleteEmpleado(String idEmpleado);




}
