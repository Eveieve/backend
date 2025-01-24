package day12_0123.StaticClass;

import static day12_0123.StaticClass.AllStatic.hap;

class AllStatic {


    private AllStatic() {

    }

    public static int hap (int a, int b){
        int v = a + b;
        return v;

    }
    // private static int hap 으로 선언하면 밖에서 사용 못하는 클래스임.
    // 시스템 클래스들은 이렇게 되어 있음.

}

public class StaticTest {
    public static void main(String[] args) {

        //AllStatic st = new AllStatic(); // error: AllStatic()' has private access in 'day12_0123.StaticClass.
        int result = hap (10, 20);

        // p
    }
}
