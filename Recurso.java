package com.varela.objetos;

public abstract class Recurso {
    protected String id;
    protected String titulo;
    protected boolean disponible;

    public Recurso(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = true;
    }

    public abstract void mostrarFicha();

    public String getId() {
        return id;
    }
}


