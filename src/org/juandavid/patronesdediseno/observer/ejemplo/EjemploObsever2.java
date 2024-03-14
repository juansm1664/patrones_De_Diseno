package org.juandavid.patronesdediseno.observer.ejemplo;

import org.juandavid.patronesdediseno.observer.UsuarioRepositorio;

public class EjemploObsever2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();

        repo.addObserver((o, u)-> System.out.println("enviando un email al usuario"));
        repo.addObserver((o, u)-> System.out.println("enviando un email al administrador"));
        repo.addObserver((o, u)-> System.out.println("guardando info del usuario en el logs " +
                                u + " en el logs"));
        repo.crear("Juan");
    }

}
