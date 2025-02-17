package day23.Lambda01.Ex02;

import java.util.Arrays;
import java.util.List;

public class RunnableEx {
    public static void main(String[] args) {

        /// what is runnable here?
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from a thread");
            }
        };

        Runnable runnable1 = () -> System.out.println("hello from a thread");

        // 람다식을 사용하여 프린트문을 출력하는 스레드 작성하기.

        Runnable task1 = () -> {
            for(int i =0; i<10; i++) {
                System.out.println("hello");
            }
        };

        Runnable task2 = () -> {
            for(int i =0; i<10; i++) {
                System.out.println("hello2");
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2); // task2 is lambda expression?

        thread1.start();
        thread2.start();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream().filter(num -> num%2 ==1).forEach(System.out::println);



    }
}
