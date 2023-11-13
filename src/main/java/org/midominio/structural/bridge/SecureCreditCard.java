package org.midominio.structural.bridge;

//ConcreteImplementor
public class SecureCreditCard implements ICreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con seguridad");
    }
}
