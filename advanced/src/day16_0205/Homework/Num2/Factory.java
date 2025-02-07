package day16_0205.Homework.Num2;

public abstract class Factory {
private int openHour;
private int closeHour;
private String name;

public Factory(String name, int openHour, int closeHour){
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
}

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactoryName(){


        return this.name;
    }

    public int getWorkingTime() {
        int workingTime = this.closeHour - this.openHour;
        return workingTime;
    }

    public abstract int makeProducts(char skill);


}
