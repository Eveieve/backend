package day16_0205.Ex1;

import java.rmi.Remote;

// Tv needs a remoteControl!
public class Tv implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Turn on Tv.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Tv.");

    }


}
