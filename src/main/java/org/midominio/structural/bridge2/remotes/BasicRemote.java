package org.midominio.structural.bridge2.remotes;

import org.midominio.structural.bridge2.devices.Device;

//Abstraction
public class BasicRemote implements IRemote{
    protected Device device;

    public BasicRemote(Device device){
        this.device = device;
    }
    @Override
    public void power() {
        device.onOff();
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
        System.out.println("Volumen " + device.getVolume());
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
        System.out.println("Volumen " + device.getVolume());
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
        System.out.println("Canal " + device.getChannel());
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
        System.out.println("Canal " + device.getChannel());
    }

    @Override
    public void display() {
        device.display();
    }
}
