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

    private int memoryVolume;

    // 디폴트 메소드를 재정의 가능
    // 내가 사용했ㄷ너 이전 볼륨을 기억했다가 쉿모드 해제 후 복원
    // 디폴트 메소드는 선택적 오버라이딩 가능.
    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memoryVolume = this.volume;
            System.out.println("mute mode now");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("mute mode disabled");
            setVolume(this.memoryVolume);
        }
        RemoteControl.super.setMute(mute); //원래 볼륨
    }


}
