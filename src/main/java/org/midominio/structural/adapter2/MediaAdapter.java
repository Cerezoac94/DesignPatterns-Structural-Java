package org.midominio.structural.adapter2;

//Podría ser con composición -> 1. implementar MediaPlayer
//2. Atributo privado tipo MediaPlayer
//3. Inicializar MediaPlayer en constructor
public class MediaAdapter extends MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        if(advancedMediaPlayer instanceof VlcPlayer){
            advancedMediaPlayer.playVlc(fileName);
        }else if(advancedMediaPlayer instanceof Mp4Player){
            advancedMediaPlayer.playMp4(fileName);
        }else {
            System.out.println("Archivo no soportado");
        }
    }
}
