package org.midominio.structural.bridge;

//Abstraction
public abstract class CreditCard {
    protected ICreditCard tarjeta;
    protected CreditCard(ICreditCard tarjeta){
        this.tarjeta = tarjeta;
    }

    public abstract void realizarPago();
}
