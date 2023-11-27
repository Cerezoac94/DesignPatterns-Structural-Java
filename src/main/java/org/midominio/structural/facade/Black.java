package org.midominio.structural.facade;

public class Black implements ICredit{
    @Override
    public void showCredit() {
        System.out.println("Tarjeta Black, credito de 1,000,000");
    }
}
