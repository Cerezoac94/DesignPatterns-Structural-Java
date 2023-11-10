package org.midominio.structural.adapter;

//Adaptee
public class BlackCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        System.out.println("Tarjeta Black: Pagando con seguridad ALTA nivel A");
    }
    @Override
    public void payWithSecureLevelZ() {

    }
}
