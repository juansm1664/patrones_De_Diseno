package org.juandavid.patronesdediseno.abstractfactory;

import org.juandavid.patronesdediseno.abstractfactory.producto.PizzaNYItaliana;
import org.juandavid.patronesdediseno.abstractfactory.producto.PizzaNYVegetariana;
import org.juandavid.patronesdediseno.abstractfactory.producto.PizzaNyPepperoni;

public class PizzeriaNYFactory extends PizzeriaZonaAbstractFactory{


    @Override
    PizzaProducto crearPizza(String tipo) {

        PizzaProducto producto = switch (tipo) {
            case "Vegetariana" -> new PizzaNYVegetariana();
            case "Pepperoni" -> new PizzaNyPepperoni();
            case "Italiana" -> new PizzaNYItaliana();
            default -> null;
        };
        return producto;
    }
}
