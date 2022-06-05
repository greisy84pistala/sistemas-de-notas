package com.cuarto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Archivo {
    public String nombreArchivo;
    public ListaEstudiantes miLista;

    public Archivo(String nombre) {
        this.nombreArchivo = nombre;
    }

    Archivo(String nombre, ListaEstudiantes miLista) {
         this.nombreArchivo = nombre;
         this.miLista = miLista;
        
    }
    
    
    public void leerArchivo(){
        String linea;
        int apartado=0; //#Estudiante, #Notas
        StringBuffer codigo,nombres;
        StringBuffer materia, nota1, nota2, nota3; 
        try{
            BufferedReader br = 
                    new BufferedReader(new FileReader(nombreArchivo));
            while((linea = br.readLine())!=null){
                //System.out.println(linea);
                linea = linea.trim();
                codigo = new StringBuffer();
                nombres = new StringBuffer();
                materia = new StringBuffer();
                nota1 = new StringBuffer();
                nota2 = new StringBuffer();
                nota3 = new StringBuffer();
                
                if(linea.length()!=0){
                    if(linea.compareTo("#Estudiante")==0){
                        apartado=1; //apartado 1 estud
                    }
                    else if(linea.compareTo("#Notas")==0){
                        apartado=2; //apartado 2 notas
                    }
                    else{
                        //System.out.println("Apartado ->" + apartado);
                        //System.out.println(linea);
                        if(apartado==1){ //Estamos leyendo Estudiantes
                            
                           asignarValores(linea, codigo, nombres); 
                           Estudiante e = new Estudiante(codigo.toString(), nombres.toString());
                           miLista.agregar(e);
                           
                        }
                        else if(apartado==2){ //Estamos leyendo notas
                            asignarValores(linea,codigo,materia,nota1,nota2,nota3);
                            Notas n = new Notas(materia.toString(),Double.parseDouble(nota1.toString()),Double.parseDouble(nota2.toString()),Double.parseDouble(nota3.toString()));
                            //miListaEstudiante.asignarNota("002", new Notas("poo", 3.0,2.5,4.0));
                            miLista.asignarNota(codigo.toString(), n);
                        }
                        
                    }
                }
                
            }
            
        }
        catch(IOException e){
           e.getMessage();
        }
    }
    
    
    private void asignarValores(String linea, StringBuffer ...arreglo ){
        StringTokenizer tokens;
        tokens = new StringTokenizer(linea, ",");
       
        for (StringBuffer e: arreglo){
            e.append(tokens.nextToken());
        }
        
    }
    
}
