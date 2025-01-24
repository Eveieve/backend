package day12_0123.Singleton;


class Singleton {

    // 클래스 안이니까 Singleton 클래스 사용가능
    private static Singleton singleObj; // 객체를 Singleton 클래스 사용하여 선언만하기. 정의하지않고

    // private 생성자
    // 외부에서 new 못하게
    private Singleton() {}


    // 대신 외부인들은 getInstance 메서드를 통해 singleObj 를 간접접근 할 수 있음.
    public static Singleton getInstance(){
        return singleObj;
    }

}


