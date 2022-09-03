package com.GrupoJoel.ProyectoCicloTres.Controllers;

import com.GrupoJoel.ProyectoCicloTres.Models.Empleados;
import com.GrupoJoel.ProyectoCicloTres.Models.ObjectAnswer;
import com.GrupoJoel.ProyectoCicloTres.Service.EmpleadoManagerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorEmpleado {

    @Autowired
    private EmpleadoManagerInterface EmpleadoManagerX;

    //Creamos el controlador de la URL StudentsRegister para traer todos los Empleados
    @GetMapping("/EmpleadosRegistrados")
    public ResponseEntity<List<Empleados>> getEmpleadoX(){
        return new ResponseEntity<>(EmpleadoManagerX.getEmpleadoX(), HttpStatus.ACCEPTED);
    }

    //Creamos una consulta por medio de un PATH PARAMS para un solo empleado
    //En internet debe escribirse localhost:8080/[Aqui el IdStudent]
    @GetMapping("/OnlyEmpleadoBD/{idEmpleado}")
    public ResponseEntity<Object> getEmpleadoXPath(@PathVariable String idEmpleado){
        try {
            Empleados EmpleadoX = EmpleadoManagerX.getOnlyEmpleado(idEmpleado);
            return new ResponseEntity<>(EmpleadoX, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Metodo para crear un Empleado
    @PostMapping("/CreateEmpleadoBD")
    public ResponseEntity<String> PostCreateEmpleado(@RequestBody Empleados EmpleadoX){
        try {
            String MensajeX = EmpleadoManagerX.setCreateEmpleado(EmpleadoX);
            return new ResponseEntity<>(MensajeX,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Metodo para modificar un empleado
    @PutMapping("/ModificEmpleadoBD")
    public ResponseEntity<ObjectAnswer> putModificEmpleado(@RequestBody Empleados EmpleadoX){

        try {
            Empleados EmpleadoBD = EmpleadoManagerX.UpdateEmpleadoAll(EmpleadoX);
            return new ResponseEntity<>(new ObjectAnswer("Actualizacion Exitosa",EmpleadoBD),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ObjectAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    //Metodo para eliminar un Empleado
    @DeleteMapping("/DeleteEmpleadoBD/{idEmpleado}")
    public ResponseEntity<ObjectAnswer> DeleteEmpleado(@PathVariable String idEmpleado){

        try {

            String Mensaje = EmpleadoManagerX.DeleteEmpleado(idEmpleado);
            return new ResponseEntity<>(new ObjectAnswer(Mensaje,null),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ObjectAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }


}
