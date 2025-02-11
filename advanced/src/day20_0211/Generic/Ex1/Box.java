package day20_0211.Generic.Ex1;

public class Box<T> {
    private T item;
    private int count = 0; // item 개수 추적하는 필드

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
