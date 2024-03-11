package org.juandavid.patronesdediseno.abstractfactory.producto;

import org.juandavid.patronesdediseno.abstractfactory.PizzaProducto;

public class PizzaNYVegetariana extends PizzaProducto {


    public PizzaNYVegetariana() {
        super();
        nombre = "Pizza vegetariana NY";
        masa = "Masa Integral vegana ";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Espinaca");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar por 25 min a 150°C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en rebanadas cuadradass");

    }
}
