package org.midominio.structural.bridge2.remotes;

//Interfaz que define el contrato del control (Define contrato de Abstraction)
public interface IRemote {
    void power();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();
    void display();
}
