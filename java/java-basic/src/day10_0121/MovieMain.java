package day10_0121;

import java.util.Scanner;

// 실행클래스, 나머지 BookDTO 등은 데이터 클래스라 부른다.
public class MovieMain {
    // 실체화
    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO(); // 메모리 생성부분만 메인 메소드에 남아있기. 데이터는 데이터 클래스에서 받을 것임.
        // movie1 참조변수는 힙에 만들어질 메모리공간의 주소값을 저장하고 있다. 
        // Dark Nus 

        MovieDTO movie3 = new MovieDTO();
        movie3.title = "Dark Nuns";
        movie3.startDate = 20250124;
        movie3.actor = "leejinwook";
        movie3.time = "180";
        movie3.grade = "15세이상";
        
        // Create another movie on my own 

        MovieDTO hitman = new MovieDTO();
        hitman.title = "Hitman2";
        hitman.startDate = 20250117;
        hitman.actor = "someone";
        hitman.time = "200";
        hitman.grade = "15세이상";
        
        // when you create instance with the new keyword, you create a memory box in the heap.

        // 출력할때바다 sout 을 반복해야 함 -> print movie 라는 메소드로 처리하기.

        hitman.printMovie(hitman); // MovieDTO 에 정의된 메소드로 출력함.
        movie3.printMovie(movie3);

        //
        InputMovieSc movieSc = new InputMovieSc(); // static 으로 정의 안됐으니 인스턴스화시켜야함.
        movieSc.inputObject(movie3); // this method gets movie info frpm user
        movie3.printMovie(movie3);

        MovieDTO movie4 = new MovieDTO();
        movie4.printMovie(movie4);

    }
}
