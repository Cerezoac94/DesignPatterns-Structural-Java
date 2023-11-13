package org.midominio;


//import org.midominio.structural.bridge.ClassicCreditCard;
//import org.midominio.structural.bridge.SecureCreditCard;
//import org.midominio.structural.bridge.UnsecureCreditCard;
//import org.midominio.structural.bridge.CreditCard;

import org.midominio.structural.bridge2.devices.SoundSystem;
import org.midominio.structural.bridge2.devices.Tv;
import org.midominio.structural.bridge2.remotes.AdvancedRemote;
import org.midominio.structural.bridge2.remotes.BasicRemote;
import org.midominio.structural.bridge2.remotes.IRemote;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        //Bridge 1
//        CreditCard creditCard = new ClassicCreditCard(new UnsecureCreditCard());
//        creditCard.realizarPago();
//
//        creditCard = new ClassicCreditCard(new SecureCreditCard());
//        creditCard.realizarPago();

        //Bridge 2
        IRemote remoto = new BasicRemote(new Tv("Sony"));
        remoto.power();
        remoto.channelUp();
        remoto.display();

        remoto = new BasicRemote(new SoundSystem("Bose"));
        remoto.power();
        remoto.display();

        AdvancedRemote remotoUniversal = new AdvancedRemote(new SoundSystem("Sony"));
        remotoUniversal.power();
        remotoUniversal.setMode("Aux");
        remotoUniversal.channelUp();
        remotoUniversal.volumeUp();
        remotoUniversal.display();
    }
}