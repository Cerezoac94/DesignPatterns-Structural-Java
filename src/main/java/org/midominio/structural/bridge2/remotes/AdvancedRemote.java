package org.midominio.structural.bridge2.remotes;

import org.midominio.structural.bridge2.devices.Device;
import org.midominio.structural.bridge2.devices.SoundSystem;

//RefinedAbstraction
public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute(){
        System.out.println("Mute");
        device.setVolume(0);
    }

    public void setMode(String mode){
        if(device instanceof SoundSystem){
            ((SoundSystem) device).setMode(mode);
        }
    }

    public void getMode(){
        if(device instanceof SoundSystem){
            ((SoundSystem) device).getMode();
        }
    }
}
