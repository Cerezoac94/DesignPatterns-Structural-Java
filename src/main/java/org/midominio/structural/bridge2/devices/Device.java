package org.midominio.structural.bridge2.devices;

//Implementor
public interface Device {
    public void onOff();
    public boolean isOn();
    public void setVolume(int volume);
    public int getVolume();
    public void setChannel(int channel);
    public int getChannel();
    public void display();

}
