package com.varela.objetos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> lista = new ArrayList<>();

    public void agregar(Recurso r) {
        lista.add(r);
    }

    public void mostrarTodo() {
        for (Recurso r : lista) {
            r.mostrarFicha();
        }
    }

    public Recurso buscar(String id) {
        for (Recurso r : lista) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }
}
