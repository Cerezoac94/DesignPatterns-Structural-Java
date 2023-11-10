package org.midominio.structural.adapter2;
//Si se usa composición en adapter -> Convertir a interfaz y cambiar metodoa tipo abstracto
//Y deberá crearse una clase concreta de MediaPlayer para el tipo Mp3
public class MediaPlayer {
    public void play(String fileName){
        System.out.println("Playing mp3 file. Name: " + fileName);
    };
}
