package day16_0205.Ex1;

// Tv needs a remoteControl!
public class Tv implements RemoteControl {

    private int volume;

    public Tv(){
        System.out.println("Tv has been paired ");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Tv.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Tv.");

    }

    @Override
    public void checkVolume() {
        System.out.println("Current volume: " + this.volume);
    }

    @Override
    public void setVolume(int volume) {

        if (this.volume == RemoteControl.MAX_VOLUME)
        System.out.println("Tv's max volume has reached");
        else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("Tv is mute");
        }else {
            System.out.println("Set volume of Tv to: "+ (this.volume = volume));
        }
    }

}
