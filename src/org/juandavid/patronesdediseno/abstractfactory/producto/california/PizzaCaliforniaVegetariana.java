package org.juandavid.patronesdediseno.abstractfactory.producto.california;

import org.juandavid.patronesdediseno.abstractfactory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza california vegetariana";
        masa = " Masa delgada light";
        salsa = " Salsa BBQ light";
        ingredientes.add("Queso mozzarella");
        ingredientes.add(" aceitunas");
        ingredientes.add("Espinacas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 25 min a temperatura de 28°C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortar en rebanadas en forma de triangulo ");

    }
}
