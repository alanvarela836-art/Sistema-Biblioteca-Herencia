package com.varela;

import com.varela.objetos.Biblioteca;
import com.varela.objetos.Digital;
import com.varela.objetos.Libro;
import com.varela.objetos.Revista;

public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblio = new Biblioteca();

        Libro l1 = new Libro("L01", "El Quijote", "Cervantes");
        Revista r1 = new Revista("R01", "Time", "Enero 2026");
        Digital d1 = new Digital("D01", "Java para Principiantes", "PDF", 4.5);

        miBiblio.agregar(l1);
        miBiblio.agregar(r1);
        miBiblio.agregar(d1);

        System.out.println("Inventario Actualizado (Incluyendo Digital):");
        miBiblio.mostrarTodo();
    }
}