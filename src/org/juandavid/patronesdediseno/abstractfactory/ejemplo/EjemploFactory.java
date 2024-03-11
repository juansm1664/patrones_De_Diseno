package org.juandavid.patronesdediseno.abstractfactory.ejemplo;

import org.juandavid.patronesdediseno.abstractfactory.PizzaProducto;
import org.juandavid.patronesdediseno.abstractfactory.PizzeriaCaliforniaFactory;
import org.juandavid.patronesdediseno.abstractfactory.PizzeriaNYFactory;
import org.juandavid.patronesdediseno.abstractfactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny  = new PizzeriaNYFactory();

        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("Queso");
        System.out.println("pedro ordena la pizza" + pizza.getNombre());

        pizza = ny.ordenarPizza("Pepperoni");
        System.out.println("laura ordena una " + pizza.getNombre());

         pizza = ny.ordenarPizza("Vegetariana");
        System.out.println("santiago ordena una " + pizza.getNombre());

         pizza = california.ordenarPizza("Pepperono");
        System.out.println("laura ordena una " + pizza.getNombre());

    }
}
