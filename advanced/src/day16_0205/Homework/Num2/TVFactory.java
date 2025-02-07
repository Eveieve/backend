package day16_0205.Homework.Num2;

public class TVFactory extends Factory implements IWorkingTogether{
    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        return 0;
    }

    @Override
    public int WorkTogether(IWorkingTogether partner) {
        return 0;
    }
}
