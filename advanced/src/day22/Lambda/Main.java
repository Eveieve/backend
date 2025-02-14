package day22.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override // Runnable is an expression
            public void run() {
                System.out.println("hello from a thread"); // 익명 객체.
            }
        };

        Runnable runnable1 = () -> System.out.println("hello from thread"); // lambda expression

        Function<String, Integer> stringLength = String::length;

        List<String> names = Arrays.asList("Alices", "bob", "john", "david");
        names.forEach(System.out::println);

        /// 람다 표현식 사용하여
        Runnable task = () -> {
            for(int i =0; i<10; i++) {
                System.out.println("hello java");
            }
        };

        Thread thread = new Thread(task);
        //Thread thread1 = new Thread
        thread.start();
        //thread2.start();

        ///
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream().filter(num -> num%2 ==0).forEach(System.out::println);


    }
}
