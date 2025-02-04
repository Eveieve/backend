package day15_0204.Ex4;

// 떠넘기는 방식의 예외 처리 예제

public class ThrowsEx {
    // 메인한테 이렇게 던지는 경우는 별로 없긴함~
    public static void main(String[] args) { // 메인메소드에서 throws 키워드 예외는 jvm이 최종적으로 처리함.
        try {
            findClass();
        } catch (ClassNotFoundException e) { // or catch (Exception e) or catch (Throwable e)
            System.out.println("예외처리" + e.getMessage()); // 호출한곳에서 예외를 처리함..
            //throw new RuntimeException(e); // ?이 라인은 어떤 일을 하는가?
        }

    }
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
//    public static void findClass() throws Exception{ // 더 큰 범위라 받을 수 있음. 자식은 부모에 담길 수 있다.
//        Class.forName("java.lang.String2");
//    }
//public static void findClass() throws Throwable{ // 제일 큰 범위라 받을 수 있음
//    Class.forName("java.lang.String2");
//}
}
// Exception 으로만 처리하면 범위가 커서 성능 저하 발생. 좁은 범위의 Exception으로 처리할 수 있음.
