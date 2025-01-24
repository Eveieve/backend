package day13_0124.Homework.Quiz1;

public class Tv {
    String color;
    boolean power;
    int channel;

    //public Tv(){}

    public Tv(){
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power(){
        this.power = !this.power;
    }

    public void channelUp(){
        this.channel +=1;
    }

    public void channelDown() {
        this.channel -=1;
    }

    public void print(){
        System.out.printf("color: %s    power: %b   channel: %d\n", this.color, this.power, this.channel);
    }
}
