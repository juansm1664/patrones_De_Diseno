package org.juandavid.patronesdediseno.abstractfactory.producto.california;

import org.juandavid.patronesdediseno.abstractfactory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza california Pepperoni";
        masa = " Masa delgada";
        salsa = " Salsa BBQ light";
        ingredientes.add("Queso mozzarella");
        ingredientes.add(" Pepperoni");
        ingredientes.add("Espinacas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar a 50 min ");

    }

    @Override
    public void cortar() {
        System.out.println("cortar en cuadrados");

    }
}
