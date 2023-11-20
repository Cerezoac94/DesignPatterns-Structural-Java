package org.midominio.structural.decorator;

//Decorator | BaseDecorator
public class CreditDecorator implements ICredit{
    protected ICredit decoratedCredit;

    public CreditDecorator(ICredit decoratedCredit){
        this.decoratedCredit = decoratedCredit;
    }
    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
    }
}
