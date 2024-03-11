package org.juandavid.patronesdediseno.abstractfactory;

import org.juandavid.patronesdediseno.abstractfactory.producto.PizzaNYVegetariana;
import org.juandavid.patronesdediseno.abstractfactory.producto.california.PizzaCaliforniaPepperoni;
import org.juandavid.patronesdediseno.abstractfactory.producto.california.PizzaCaliforniaQueso;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {

        PizzaProducto producto = switch (tipo) {
            case "Queso" -> new PizzaCaliforniaQueso();
            case "Pepperono" -> new PizzaCaliforniaPepperoni();
            case "Vegetariana" -> new PizzaNYVegetariana();
            default -> null;
        };

        return producto;
    }
}
