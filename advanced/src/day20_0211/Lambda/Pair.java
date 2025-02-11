package day20_0211.Lambda;

// 파라미터 하나 더?
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(){}
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
