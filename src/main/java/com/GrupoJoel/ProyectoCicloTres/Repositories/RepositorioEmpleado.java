package com.GrupoJoel.ProyectoCicloTres.Repositories;

import com.GrupoJoel.ProyectoCicloTres.Models.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpleado extends JpaRepository<Empleados,String> {
}
