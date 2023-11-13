package org.midominio.structural.bridge;

//RefinedAbstraction
public class ClassicCreditCard extends CreditCard{
    public ClassicCreditCard(ICreditCard tarjeta){
        super(tarjeta);
    }
    @Override
    public void realizarPago() {
        tarjeta.realizarPago();
    }
}
