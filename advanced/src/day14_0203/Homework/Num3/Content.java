package day14_0203.Homework.Num3;

public abstract class Content {
    String title;
    int price;

    public Content() {

    }

    public Content(String title) {
        this.title = title;
    }

    public abstract void totalPrice();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println(this.getTitle() + "비디오의 가격은" + this.getPrice() + "입니다.");
    }
}
