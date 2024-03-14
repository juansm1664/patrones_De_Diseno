package org.juandavid.patronesdediseno.decorator;

public class MayusculaDecorador  extends TextoDecorador{



    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
