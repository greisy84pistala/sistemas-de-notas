package com.cuarto;

import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {
    List <Estudiante> listaEstudiantes;

    public ListaEstudiantes() {
        this.listaEstudiantes = new ArrayList();
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    
    public void reportar(){
        for(Estudiante e: listaEstudiantes ){
            System.out.println("Codigo-> " + e.getCodigo());
            System.out.println("Nombres-> " + e.getNombres());
            e.verNotas();
            
        }
    }
    
    public void agregar(Estudiante e){
        this.listaEstudiantes.add(e);
    }
    
    public void asignarNota(String codigo, Notas nota){
        for(Estudiante e: listaEstudiantes){
            if(codigo.equals(e.getCodigo())){
                e.addNota(nota);
            }
        }
    }
}
