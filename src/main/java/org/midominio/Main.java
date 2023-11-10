package org.midominio;

//import org.midominio.structural.adapter.CreditCard;

import org.midominio.structural.adapter2.*;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        //Adapter 1
//        CreditCard creditCard = new CreditCard();
//        creditCard.pay("classic");
//        creditCard.pay("gold");
//        creditCard.pay("black");
//        creditCard.pay("platinum");

        //Adapter 2
        AudioPlayer audioPlayer = new AudioPlayer();
        MediaPlayer mediaPlayer = new MediaPlayer();

        audioPlayer.play(mediaPlayer, "Cancion 1");

        MediaAdapter vlcPlayer = new MediaAdapter(new VlcPlayer());
        audioPlayer.play(vlcPlayer, "cancion 2");
        MediaAdapter mp4Player = new MediaAdapter(new Mp4Player());
        audioPlayer.play(mp4Player, "cancion 3");
    }
}