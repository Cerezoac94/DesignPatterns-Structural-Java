package org.midominio.structural.composite2.paqueteria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caja implements IComponent{
    List<IComponent> components = new ArrayList<>();;

    public Caja(){

    }
    public Caja(IComponent... components){
        this.components.addAll(Arrays.asList(components));
    }

    public void addProduct(IComponent component){
        this.components.add(component);
        System.out.println("¡Añadido correctamente!");
    }

    public void addProduct(IComponent... components){
        this.components.addAll(Arrays.asList(components));
        System.out.println("¡Añadidos correctamente!");
    }

    public void removeProduct(IComponent component){
        this.components.add(component);
        System.out.println("¡Removido correctamente!");
    }

    public void removeProduct(IComponent... components){
        this.components.addAll(Arrays.asList(components));
        System.out.println("¡Removidos correctamente!");
    }

    @Override
    public void getNameProduct() {
        for(IComponent component : components){
            component.getNameProduct();
        }
    }

    @Override
    public double getPriceProduct() {
        double total = 0.0;
        for(IComponent component : components){
            total += component.getPriceProduct();
        }
        return total;
    }
}
