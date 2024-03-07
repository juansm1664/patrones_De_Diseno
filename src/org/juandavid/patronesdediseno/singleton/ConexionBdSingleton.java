package org.juandavid.patronesdediseno.singleton;

public class ConexionBdSingleton {

    private static ConexionBdSingleton instancia;
    private ConexionBdSingleton(){
        System.out.println("conectando algún motor de base de datos ");
    }

    public static ConexionBdSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexionBdSingleton();
        }
        return instancia;
    }



}
