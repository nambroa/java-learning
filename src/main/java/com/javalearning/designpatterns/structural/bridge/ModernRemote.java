package com.javalearning.designpatterns.structural.bridge;

public class ModernRemote extends Remote {
    public ModernRemote(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}
