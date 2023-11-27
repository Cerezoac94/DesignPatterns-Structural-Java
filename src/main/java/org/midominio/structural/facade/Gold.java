package org.midominio.structural.facade;

public class Gold implements ICredit{

    @Override
    public void showCredit() {
        System.out.println("Tarjeta Gold, credito de 5,000");
    }
}
