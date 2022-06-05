package com.cuarto;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String codigo;
    private String nombres;
    private List<Notas> listaNotas;

    public Estudiante(String codigo, String nombres) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.listaNotas = new ArrayList();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<Notas> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Notas> listaNotas) {
        this.listaNotas = listaNotas;
    }
    
    public void addNota(Notas nota){
        listaNotas.add(nota);
    }
    
    public void verNotas(){
       
        for(Notas n: listaNotas){
            System.out.println("Materia -> " + n.getMateria());
            System.out.println("Parcial1 ->" + n.getParcial1());
            System.out.println("Parcial2 ->" + n.getParcial2());
            System.out.println("Final ->" + n.getPfinal());
            System.out.println("Notas Definitiva ->" + definitiva(n));
            System.out.println("----------------------------------------");
        }

    }

    public double definitiva(Notas notas){
        return (notas.getParcial1()*0.3+ notas.getParcial2()*0.3+notas.getPfinal()*0.4);
    }
}

