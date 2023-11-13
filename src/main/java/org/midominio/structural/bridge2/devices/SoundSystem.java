package org.midominio.structural.bridge2.devices;

//ConcreteImplementor
public class SoundSystem implements Device{
    private String brand;
    private boolean on = false;
    private int volume = 40;
    private int channel = 1;
    private String mode = "Radio";

    public SoundSystem(){}

    public SoundSystem(String brand){
        this.brand = brand;
    }

    @Override
    public void onOff() {
        this.on = !this.on;
        if(on){
            System.out.println("Encendiendo Sistema de sonido");
        }else{
            System.out.println("Apagando Sistema de sonido.");
        }
    }

    public boolean isOn(){
        return this.on;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setChannel(int channel) {
        if(this.mode.equals("Radio")){
            this.channel = channel;
        }else {
            System.out.println("No se puede cambiar canal en modo " + this.mode);
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    public void setMode(String mode){
        this.mode = mode;
    }

    public String getMode(){
        return this.mode;
    }

    @Override
    public void display() {
        if(on){
            System.out.println("Sound System " + this.brand);
            System.out.println("Modo " + this.mode);
            if(this.mode.equals("Radio")){
                System.out.println("Estación " + this.channel);
            }
            System.out.println("Volumen " + this.volume);
        }
    }
}
