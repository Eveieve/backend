package day19_0210.ReflectionEx;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {

        String str = new String("Class 클래스 테스트");
        Class<? extends String> cls = str.getClass();
        System.out.println(cls);

        //.class 리터럴로 얻기
        Class<? extends String> cls2 = String.class;
        System.out.println(cls2);
        //Class.forName()

        try {// forName 사용하려면 반드시 트라이 캐치부분 써줘야 한다!
            Class<?> cls3 = Class.forName("java.lang.String"); // 런타임때 불러오기 때문에 동적 로딩
            System.out.println(cls3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("1. " + cls.getSimpleName());
        System.out.println("2. " + cls.getPackage());
        System.out.println("2. " + cls.getPackageName());
        System.out.println("3. " + cls.getName());
        System.out.println("3. " + cls);
        System.out.println("3. " + cls.toString());
        System.out.println("3. " + cls.toGenericString());

        System.out.println("3. " + Arrays.toString(cls.getFields()));
        System.out.println("3. " + Arrays.toString(cls.getMethods()));
        System.out.println("3. " + Arrays.toString(cls.getInterfaces()));
        System.out.println("3. " + cls.getSuperclass());






    }
}
