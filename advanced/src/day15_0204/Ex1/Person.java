package day15_0204.Ex1;

public sealed class Person permits Employee, Manager{
    public String name;
    public void work() {
        System.out.println("Work has not been specified yet.");
    }
}
