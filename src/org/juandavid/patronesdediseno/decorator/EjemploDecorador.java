package org.juandavid.patronesdediseno.decorator;

public class EjemploDecorador {

    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal juanDavid");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);

        ReversaDecorador reversa = new ReversaDecorador(mayuscula);

        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);

        System.out.println(subrayar.darFormato());
    }
}
