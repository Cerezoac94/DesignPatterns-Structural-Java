package org.midominio.structural.adapter;

//Adaptee
public class GoldCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {

    }
    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Tarjeta Gold: Pagando con seguridad BAJA nivel Z");
    }
}
