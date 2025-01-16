package day07.note;

// 자바에서는 문자열을 처리할때 자료형 클래스 3개(String, String Buffer, StringBuilder)사용.
// 문자열을 다루는데 있어 공통적으로 사용되지만, 사용 목적에 따라 쓰임새가 다르다.

// 자바에서는 String 객체의 값을 변경할 수 없다.Immutable. 불변의. 내부 상수풀에서 운영관리한다.
public class StringBufferStringBuilderEx {
    public static void main(String[] args) {
        int age = 40;
        String name = "신세계";
        System.out.println(name.hashCode()); // 주소값
        name = "신숙주"; // 새로운 공간 또 만듦.
        System.out.println(name.hashCode());
        System.out.println(name == name); //???


        String a = "Hello"; // literal 값. 불변.
        System.out.println(a.hashCode()); // hashCode -> instance 메모리 주소값을 이용해 만든 해시코드를 반환한다.
        // => 참조변수임.
        a = "Hello" + "JAVA";
        System.out.println(a.hashCode());
        // 참조변수 a가 참조하는 메모리의 "Hello" 값에 "JAVA"문자열을 더해서 String 객체의 값을 변경시킴.
        // 실제 메모리에서는 "Hello JAVA"를 따로 만들고 참조 변수 a를 새로운 주소값으로 할당한다.
        // 문자열 값 자체는 불변이기 때문에, 새로운 문자열 데이터 객체를 a에 대입한다.

        // ex) 수강생 질문
        String ab= "Hello";
        System.out.println(ab.hashCode()); // bc와 해시코드 값이 같음.
        String bc = "Hello";
        System.out.println(bc.hashCode()); // 동일한 공간안데 Hello 가 저장됨??? 같은 문자열을 두개 만들지 안는다??
        ab = ab + "JAVA";
        System.out.println(ab.hashCode()); // 원래 있던 Hello 에 붙이는게 아니라 새로 만들어지는 것임.

        // 왜 문자열은 왜 불변으로 설계되어있는가?
        // 어디에 설명되어있는지 ㅎㅎ
        // 1. JVM에서는 String Constant Pool 문자열 상수풀을 운영한다. 문자열을 상수화 시켜서 (값 변경 안된다는 뜻) 다른 변수 또는 다른 객체와 공유하게끔 운영한다.
        // 상수풀은 냉장고 같은 것. 상수(공용으로 사용하는 공간).=> 메모리 효율성을 높이기 위해서.(중복 발생 방지)
        // 2. 우리가 운영하는 환경은 모두 multi thread 환경. 이 환경에서 동기화 문제 발생 방지를 위해 immutable 로 만듦.
        // 동기화 문제 :
        // 기본 데이터는 무결점 상태로 유지되어야 한다~
        // 3. 보안 (Security)

        // Q. 숫자도 데이터인데 왜 문자열만 불변으로 되어있나?

        // String 주소할당 방식 2가지 : 1. 리터럴 할당방식. 2. new 를 이용.
        // 차이점:

        //Q. 쓰레드에서 안전한게 무엇인가~ 쓰레드 세이프 환경이 무엇인가~
        // Q. 빌더가 단일 쓰레드에서 최적화되어있단 말은 무엇인가?
        // 코테 볼땐 빌더 사용해라~
    }
}
