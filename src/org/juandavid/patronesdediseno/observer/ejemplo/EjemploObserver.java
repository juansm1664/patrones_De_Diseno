package org.juandavid.patronesdediseno.observer.ejemplo;

import org.juandavid.patronesdediseno.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);

        google.addObserver((observable, obj) -> {
            System.out.println("juan: " + ((Corporacion)observable).getNombre()
            + "Nuevo precio $" + ((Corporacion)observable).getPrecio());

        });
        google.addObserver((observable,obj) -> {
            System.out.println("pedro: " + ((Corporacion)observable).getNombre()
            + "Nuevo precio $" + ((Corporacion)observable).getPrecio());
        });
        google.modificaPrecio(2000);
    }
}
