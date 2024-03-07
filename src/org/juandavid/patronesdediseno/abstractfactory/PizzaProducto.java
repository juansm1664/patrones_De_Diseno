package org.juandavid.patronesdediseno.abstractfactory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
    private String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }
    public void preparar(){
        System.out.println("preparando "+ nombre);
        System.out.println("Selección la masa" + masa);
        System.out.println("agrefando ingredientes");
        this.ingredientes.forEach(System.out::println);
    }
    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque..");
    }
    abstract public void cocinar();
    abstract void contar();

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
