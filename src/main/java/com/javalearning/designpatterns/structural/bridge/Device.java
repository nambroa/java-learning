package com.javalearning.designpatterns.structural.bridge;

/**
 * This is the actual Bridge object. It acts a way of communication between the Remote and the different devices.
 */
public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);
}
