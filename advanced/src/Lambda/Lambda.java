package Lambda;

/**
 * 람다식은 메소드를 간단한 식(expression)으로 표현하는 방법이다.
 * 람다식은 익명함수이다. 이름이 없다.
 * 메소드는 객체지향개념 용어이다.
 * 함수는 클래스에 독립적, 메소드는 클래스에 종속적
 * 람다식 작성법 >>
 * 1. 메서드의 이름과,반환타입을 제거하고 -> 를 블록앞에 추가한다.
 * 2. 반환 값이 있는 경우, 식이나 값만 적고 return 문을 생략. 끝에 ; 붙이지 않음.
 * 3. 매개 변수 타입이 추론 가능하면 생략가능 (대부분 경우 생략 가능)
 * <p>
 * 람다식 작성 주의사항>>
 * 1. 매개변수가 하나이고 타입을 붙이지 않는 경우, 괄호() 생략 가능 (타입이 없을 때만)
 * 2. 블록 안의 문장이 하나뿐일때, 괄호 {} 생략 가능. 끝에 ; 생략.
 * 단, 하나뿐인 문장이 return 문이면 괄호{} 생략 불가
 */
class Ex14_0 {
    public static void main(String[] args) {
        // Object obj = (a, b) -> a > b? a : b; // 람다식, 익명개체
        Object obj = new Object() {
            int max(int a, int b) { // 자바에서는 메서드만 존재할 수 없음. 그래서 익명 개체 안에 넣었음.
                return a > b ? a : b;
            }
        };
        // Object 타입에는 max메서드가 없잖아
        //int value = obj.max(3,5); // obj에 max 메서드 없어서 에러. 함수형 인터페이스가 필요함.
    }
}

// 함수형 인터페이스를 이용
class Ex14_2 {
    public static void main(String[] args) {
        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스.
        MyFunction f = (a, b) -> a > b ? a : b;
        // 람다식으로 간결하게 밑의 식을 표현

//        MyFunction f = new MyFunction() {
//            public int max(int a, int b) { // 자바에서는 메서드만 존재할 수 없음. 그래서 익명 개체 안에 넣었음.
//                return a > b ? a : b;
//            }
//        };
        // Object 타입에는 max메서드가 없잖아
        int value = f.max(3, 5); // obj에 max 메서드 없어서 에러. 함수형 인터페이스가 필요함.
    }
}

@FunctionalInterface // 함숳형 인터페이스는 한개의 추상 메서드만 가짐. 인터페이스의 모든 메서드는 public, abstract이기 때문에 생략 가능.
interface MyFunction {
    // max 메서드가 람다식과 맞아야함.
    // 람다식의 이름을 없앴으니 여기 이름을  max라고 붙여줌.
    // 이 추상메서드를 통해서 람다식을 호출하는거라 생각하기.
    int max(int a, int b); // 인터페이스엔 몸통 만들면 안됨.
}

//// 익명 객체를 람다식으로 대체
//class Example {
//    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
//
//Collections.sort(list,new Comparator<String>(){
//    public int compare (String s1, String s2){
//        return s2.compareTo(s1);
//    }
//    });
//}

