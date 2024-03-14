package org.juandavid.patronesdediseno.decorator;

abstract public class TextoDecorador implements Formateable {

    protected Formateable texto;


    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
