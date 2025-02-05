package day16_0205.Ex1;

// Radio needs a remoteControl too. Could be an app?!
public class Radio implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Turn on Radio.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Radio.");

    }
}
