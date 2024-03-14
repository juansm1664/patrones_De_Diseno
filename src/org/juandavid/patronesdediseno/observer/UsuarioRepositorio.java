package org.juandavid.patronesdediseno.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable {
    private List<String> repositorio = new ArrayList<>();

    public void crear(String usuario){
        repositorio.add(usuario);
        notifyObservers();
    }
}
