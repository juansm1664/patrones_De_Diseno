package org.juandavid.patronesdediseno.abstractfactory.producto;

import org.juandavid.patronesdediseno.abstractfactory.PizzaProducto;

public class PizzaNyPepperoni extends PizzaProducto {

    public PizzaNyPepperoni() {
        super();
        nombre = "Pizza pepperoni";
        masa = "Delgada extraCrugiente";
        salsa = "De tomate Organica ";
        ingredientes.add("queso mozzarela");
        ingredientes.add("Extra Pepperoni");
        ingredientes.add("piña dulce");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 40 min a 90°C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en triángulos ");

    }
}
