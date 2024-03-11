package org.juandavid.patronesdediseno.abstractfactory.producto;

import org.juandavid.patronesdediseno.abstractfactory.PizzaProducto;
import org.juandavid.patronesdediseno.abstractfactory.PizzeriaNYFactory;

public class PizzaNYItaliana extends PizzaProducto {
    public PizzaNYItaliana() {
        super();
        nombre ="Pizza Italiana";
        masa= "Masa gruesa ";
        salsa = "Salsa de tomate con oregano";
        ingredientes.add(" champiñones");
        ingredientes.add("Carne");
        ingredientes.add("Queso mozzarella");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 30 min a 120°C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortar en triangulos grandes");

    }
}
