package org.juandavid.patronesdediseno.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {
        ConexionBdSingleton con = null;
        for(int i = 0 ; i<10 ;i++){
            con = ConexionBdSingleton.getInstance();
            System.out.println("Con " + con);
        }
        ConexionBdSingleton con2 = ConexionBdSingleton.getInstance();
        ConexionBdSingleton con3 = ConexionBdSingleton.getInstance();
        boolean b1 = ((con == con2) && (con2 == con3) && (con==con3));
        System.out.println("b1 " + b1);

    }
}
