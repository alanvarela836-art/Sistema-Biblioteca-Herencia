package com.varela.objetos;

public class Libro extends Recurso {
    private String autor;

    public Libro(String id, String titulo, String autor) {
        super(id, titulo);
        this.autor = autor;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("LIBRO - ID: " + id + " | Titulo: " + titulo + " | Autor: " + autor);
    }
}
