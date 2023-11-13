package org.midominio.structural.bridge2.devices;

//ConcreteImplementor
public class Tv implements Device{
    private String brand;
    private boolean on = false;
    private int volume = 20;
    private int channel = 1;

    public Tv(){

    }

    public Tv(String brand){
        this.brand = brand;
    }

    @Override
    public void onOff() {
        this.on = !this.on;
        if(on){
            System.out.println("Encendiendo Televisión.");
        }else{
            System.out.println("Apagando Televisión.");
        }
    }

    @Override
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
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void display() {
        if(on){
            System.out.println("Tv " + this.brand);
            System.out.println("Canal " + this.channel);
            System.out.println("Volumen " + this.volume);
        }
    }
}
