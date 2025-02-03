package day14_0203.Ex2;

// special airplane
// has all the parents' methods

public class SuperAirplane extends Airplane {
// declare constants
    // but why make it static?
    public static final int NORMAL = 1;
    public static final int ADVANCED =2;

    // status field
    public int flymode = NORMAL;

    // flies in a different way - override parent's method fly()
    @Override
    public void fly() {
        if(flymode == ADVANCED)
            System.out.println("supersonic flying.");
        else
            super.fly();
    }

//    public void safetyMeasure() {
//        // impossible to override bc it was 'final' method in parent class.
//    }
}
