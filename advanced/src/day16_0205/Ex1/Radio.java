package day16_0205.Ex1;

// Radio needs a remoteControl too. Could be an app?!
public class Radio implements RemoteControl {

    private int volume;

    public Radio(){
        System.out.println("Radio has been paired ");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Radio.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Radio.");

    }

    @Override
    public void checkVolume() {
        System.out.println("Current volume of radio: " + this.volume);
    }

    @Override
    public void setVolume(int volume) {

        if (this.volume == RemoteControl.MAX_VOLUME)
            System.out.println("Radio's max volume has reached");
        else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("Radio is mute");
        }else {
            System.out.println("Set volume of Radio to : "+ (this.volume = volume));
        }
    }
}
