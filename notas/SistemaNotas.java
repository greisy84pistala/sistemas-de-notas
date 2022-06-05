package com.cuarto;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SistemaNotas {

      public static void main(String[] args) {
      
         ListaEstudiantes miListaEstudiante = 
                 new ListaEstudiantes();
         
        Archivo archivo = new Archivo("notas.txt", miListaEstudiante); 
        
        archivo.leerArchivo();
        
        miListaEstudiante.reportar();
        
        
          
          
          

/*
String Notas = new String(
"001, matematicas, 5.0, 4.0, 3.0\n" +
"001, java, 2.0, 4.0, 5.0\n" +
"002, java, 3.0, 2.5, 4.0\n" +
"002, ingles, 3.5, 4.0, 3.5\n"+
"003, matematicas, 3.0, 3.0, 2.5\n");

String Estudiante = new String(
"001, Maria Perez\n" +
"002, Luis Martinez\n" +
"003, Arturo Calle\n");

String[] aEstudiante = Estudiante.split("\n");

for (String e: aEstudiante ){
    String[] aItem = e.split(",");
    String cod = aItem[0];
    String nom = aItem[1].trim();
    //System.out.println(cod);
    //System.out.println(nom);
    miListaEstudiante.agregar(new Estudiante(cod,nom));
    
}
*/
          //lista del main
          //List <Estudiante> lEstudiante = new ArrayList();
          //lEstudiante.add(new Estudiante("001","Maria Perez"));
          //lEstudiante.add(new Estudiante("002","Camilo Ruales"));
          
          //Crear un objeto tipo ListaEstudiantes
          //y le pasamos la lista del main lEstudiante
          
         
          //Estudiante e1 = new Estudiante("001","Maria Perez");
          //e1.addNota(new Notas("mat",5.0,4.0,3.0));
          //e1.addNota(new Notas("poo",2.0,4.0,5.0));
          //e1.verNotas();
         
          /*
          miListaEstudiante.agregar(new Estudiante("001","Maria"));
          miListaEstudiante.agregar(new Estudiante("002","Luis"));
         
          miListaEstudiante.asignarNota("001", new Notas("mat",5.0,4.0,3.0));
          miListaEstudiante.asignarNota("001", new Notas("poo", 2.0,4.0,5.0));
          
          miListaEstudiante.asignarNota("002", new Notas("poo", 3.0,2.5,4.0));
         
          miListaEstudiante.reportar();
*/
    }
    
}
