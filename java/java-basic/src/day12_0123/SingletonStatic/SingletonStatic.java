package day12_0123.SingletonStatic;

public class SingletonStatic {
    private static SingletonStatic instance;

    private SingletonStatic(){}

    static {

        try {
            instance = new SingletonStatic();

        }catch(Exception e) {
            throw new RuntimeException("Error in creating singleton instance");
        }

    }

    public static SingletonStatic getInstance(){
        // 외부에서 정적 메소드인 getinstance 호출하면, 이때 초기화를 진행하여 처리한다. (lazy)
        if(instance == null) instance = new SingletonStatic();

        return instance;
    }
}
