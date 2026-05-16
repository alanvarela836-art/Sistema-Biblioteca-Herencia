package com.varela.objetos;

    public class Digital extends Recurso {
    private String formato;
    private double tamanoMB;

    public Digital(String id, String titulo, String formato, double tamanoMB) {
        super(id, titulo);
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("DIGITAL - ID: " + id + " | Titulo: " + titulo + " | Formato: " + formato + " | Tamano: " + tamanoMB + "MB");
    }
}

