package com.javalearning.designpatterns.structural.bridge;

public class MP3 implements Device {
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    // A reference to radio channels inside most MP3s.
    public int getChannel() {
        return 0;
    }

    @Override
    public void setChannel(int channel) {

    }
}
