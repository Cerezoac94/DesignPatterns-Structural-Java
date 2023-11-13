package org.midominio.structural.bridge;

//ConcreteImplementor
public class UnsecureCreditCard implements ICreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado sin seguridad");
    }
}
