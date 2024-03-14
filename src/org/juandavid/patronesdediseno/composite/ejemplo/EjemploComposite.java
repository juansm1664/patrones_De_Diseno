package org.juandavid.patronesdediseno.composite.ejemplo;

import org.juandavid.patronesdediseno.composite.Archivo;
import org.juandavid.patronesdediseno.composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio  java = new Directorio("Java");

        java.addComponente(new Archivo("PatronComposite.docx"));
        Directorio stream = new Directorio(("APi Stream"));
        stream.addComponente(new Archivo("Stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("log.png"));

        System.out.println(doc.mostrar(0));



    }
}
