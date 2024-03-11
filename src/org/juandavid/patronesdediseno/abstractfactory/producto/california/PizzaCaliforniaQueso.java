package org.juandavid.patronesdediseno.abstractfactory.producto.california;

import org.juandavid.patronesdediseno.abstractfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {



    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza california Queso";
        masa = " Masa delgada con oregano";
        salsa = " Salsa BBQ ";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("ExtraQueso");
        ingredientes.add("Queso bufalo ");
    }


    @Override
    public void cocinar() {
        System.out.println("Se debe cocinar en 35 min a una temperatura de 100°C ");

    }

    @Override
    public void cortar() {
        System.out.println("En rebanadas pequeñas triángulos");

    }
}
