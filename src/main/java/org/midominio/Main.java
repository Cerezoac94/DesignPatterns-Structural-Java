package org.midominio;


//import org.midominio.structural.decorator.*;

import org.midominio.structural.decorator2.Application;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        //Decorator 1
//        ICredit gold = new Gold();
//        ICredit blackInternationalPayment = new Black();
//        blackInternationalPayment = new InternationalPaymentDecorator(blackInternationalPayment);
//
//        ICredit goldSecureInternational = new Gold(); //ref 1
//        goldSecureInternational = new InternationalPaymentDecorator(goldSecureInternational); // ref2(ref1)
//        goldSecureInternational = new SecureDecorator(goldSecureInternational); //ref3(ref2(ref1))
//
//        System.out.println("Tarjeta gold con configuración");
//        gold.showCredit();
//
//        System.out.println("Tarjeta black con configuración");
//        blackInternationalPayment.showCredit();
//
//        System.out.println("Tarjeta gold2 con configuración");
//        goldSecureInternational.showCredit(); //Ref3 referencia de tipo SecureDecorator

        //Decorator 2
        Application appNotifier = new Application();
        appNotifier.enableDisableFacebook();
        appNotifier.enableDisableSms();
        appNotifier.notifier("correo@gmail.com", "Alerta!");
    }
}