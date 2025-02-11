package day20_0211.Generic.Ex1;

// T 타입.
// Box 에 답길 객체는 인스턴스화할때 정해줄게 .. 코스트코 카트 같은것...?
// T는 Box의 인트섵스를 생성할때 어떤 참조타입으로 대체될 수 있는 '타입매개변수'이다.
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
