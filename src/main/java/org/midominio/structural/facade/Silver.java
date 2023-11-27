package org.midominio.structural.facade;

public class Silver implements ICredit{
    @Override
    public void showCredit() {
        System.out.println("Tarjeta Silver, credito de 200,000");
    }
}
