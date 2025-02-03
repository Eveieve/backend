package day14_0203.Ex2;

public class Airplane {
    // field is not always necessary

    public void land(){
        System.out.println("we are landing.");
    }

    public void fly() {
        System.out.println("we are flying.");
    }

    public void depart() {
        System.out.println("we are departing");
    }

    public final void safetyMeasure() {
        System.out.println("starting safety measures");
    }
}
