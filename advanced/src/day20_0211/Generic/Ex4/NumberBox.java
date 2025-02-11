package day20_0211.Generic.Ex4;

import java.util.List;

//Number 타입만 지원하는 제너릭클래스
//Number를 확장하는 클래스만 NumberBox의 타입매개변수로 사용할 수 있다.
public class NumberBox<T extends Number> { // 타입 파라미터 티는 넘버 타입을 확장한다.
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }
    public double doubleValue(){
        return number.doubleValue();
    }
    // 상한 제한 와일드카드 (? extends T)
    public void printNumberList(List<? extends Number> list){ // 알려지지 않은 타입은 넘버 타입이거나 그 하위가 된다 - 확장하고 있기 때문이다.
        for(Number number : list){
            System.out.println(number);
        }

    }
    // 어떤 유형과도 함께 사용할 수 있도록 유연성 제공
    public void printList(List<?> list){ // ㅔㅕ
        for(Object element : list) System.out.println(element);
    }

    //하한 제한 와일드 카드 (? super T) 특정 타입 또는 그 상위 클래스 중 하나를 허용
    public void addNumbers(List<? super Integer> list){
        list.add(10);
    }

}
