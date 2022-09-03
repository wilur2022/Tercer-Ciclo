package com.GrupoJoel.ProyectoCicloTres.Service;

import com.GrupoJoel.ProyectoCicloTres.Models.Empleados;
import com.GrupoJoel.ProyectoCicloTres.Repositories.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerEmpleadoBD implements EmpleadoManagerInterface{

    @Autowired
    private RepositorioEmpleado RepositorioX;

    @Override
    public List<Empleados> getEmpleadoX() {
        return RepositorioX.findAll();
    }

    @Override
    public Empleados getOnlyEmpleado(String idEmpleado) throws Exception {
        Optional<Empleados> EmpleadoBD = RepositorioX.findById(idEmpleado);
        if(EmpleadoBD.isPresent()){
            return EmpleadoBD.get();
        }
        throw new Exception("Empleado NO encontrado");

    }

    @Override
    public String setCreateEmpleado(Empleados EmpleadoX) {
        RepositorioX.save(EmpleadoX);
        return "Empleado creado con Exito";
    }

    @Override
    public Empleados UpdateEmpleadoAll(Empleados EmpleadoX) throws Exception {
        Empleados EmpleadoBD = getOnlyEmpleado(EmpleadoX.getIdEmpleado());
        if(EmpleadoX.getIdEmpleado()!=null && !EmpleadoX.getIdEmpleado().equals("")){
            EmpleadoBD.setIdEmpleado(EmpleadoX.getIdEmpleado());
        };
        if(EmpleadoX.getNameEmpleado()!=null && !EmpleadoX.getNameEmpleado().equals("")){
            EmpleadoBD.setNameEmpleado(EmpleadoX.getNameEmpleado());
        };
        if(EmpleadoX.getUserEmpleado()!=null && !EmpleadoX.getUserEmpleado().equals("")){
            EmpleadoBD.setUserEmpleado(EmpleadoX.getUserEmpleado());
        };
        if(EmpleadoX.getPassword()!=null && !EmpleadoX.getPassword().equals("")){
            EmpleadoBD.setPassword(EmpleadoX.getPassword());
        };

        return RepositorioX.save(EmpleadoBD);
    }

    @Override
    public String DeleteEmpleado(String idEmpleado) {
        RepositorioX.deleteById(idEmpleado);
        return "Empleado eliminado con Exito";
    }
}
