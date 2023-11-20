package org.midominio.structural.decorator;

//ConcreteComponent
public class Black implements ICredit{
    @Override
    public void showCredit() {
        System.out.println("Tarjeta de crédito de 1,000.000");
    }
}
