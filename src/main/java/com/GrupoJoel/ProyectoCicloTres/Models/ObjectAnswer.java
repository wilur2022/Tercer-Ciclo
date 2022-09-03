package com.GrupoJoel.ProyectoCicloTres.Models;

public class ObjectAnswer {
    //Atributos
    private String Mensaje;
    private Object objeto;

    //Constructor con atributpos

    public ObjectAnswer(String mensaje, Object objeto) {
        Mensaje = mensaje;
        this.objeto = objeto;
    }

    //Constructor sin atributos
    public ObjectAnswer(){

    }

    //Getter and Setters

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
}
