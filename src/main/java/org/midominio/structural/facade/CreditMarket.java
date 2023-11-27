package org.midominio.structural.facade;

public class CreditMarket {
    private ICredit gold;
    private ICredit silver;
    private ICredit black;

    public CreditMarket(){
        this.gold = new Gold();
        this.silver = new Silver();
        this.black = new Black();
    }
    public void showCreditGold(){
        gold.showCredit();
    }
    public void showCreditSilver(){
        silver.showCredit();
    }
    public void showCreditBlack(){
        black.showCredit();
    }
}
