package com.javalearning.designpatterns.structural.bridge;

import org.springframework.boot.Banner;

public class Client {
    public void executeExample(){
        TV tv = new TV();
        MP3 mp3 = new MP3();
        Remote remote = new Remote(tv);
        ModernRemote modernRemote = new ModernRemote(mp3);

        remote.togglePower(); // talks to the TV device and toggles its power.

        modernRemote.mute(); // mutes the MP3 device.
    }
}
