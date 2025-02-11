package day20_0211.Practice;

//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요
//
public class Box<T> {

    private T value; // 어떤 타입이든 저장할 수 있는 변수

    // 어떤 밸류든 설정 가능 - T value
    public void setValue(T value) {
        this.value = value;
    }

    // 리턴하는 value 는 T 타입
    public T getValue() {
        return value;
    }

    // Class<?> => 어느타입이든 받아 검사하겠다
    public boolean isOfType(Class<?> clazz) {
        // Use Reflection
        // 리플렉션 제공하는 클래스 사용하기
        return clazz.isInstance(value);
    }
}

class Main{
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(23);
        System.out.println(integerBox.getValue());
        System.out.println(integerBox.isOfType(Integer.class));

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println(stringBox.getValue());
        System.out.println(integerBox.isOfType(String.class));


    }
}
