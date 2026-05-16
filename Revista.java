package com.varela.objetos;

public class Revista extends Recurso {
    private String edicion;

    public Revista(String id, String titulo, String edicion) {
        super(id, titulo);
        this.edicion = edicion;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("REVISTA - ID: " + id + " | Titulo: " + titulo + " | Edicion: " + edicion);
    }
}