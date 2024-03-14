package org.juandavid.patronesdediseno.decorator;

public class RemplazarEspacioDecorador extends TextoDecorador{
    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {

        return texto.darFormato().replace("","_");
    }
}
