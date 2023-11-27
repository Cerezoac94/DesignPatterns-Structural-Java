package org.midominio;


import org.midominio.structural.facade.CreditMarket;
import org.midominio.structural.facade.ICredit;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditBlack();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
    }
}