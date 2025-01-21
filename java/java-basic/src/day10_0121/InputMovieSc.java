package day10_0121;

import java.util.Objects;
import java.util.Scanner;

public class InputMovieSc {
    static final Scanner input = new Scanner(System.in);

    // Objects 타입.
   public MovieDTO inputObject(MovieDTO movie) {

       System.out.println("Enter movie title: ");
       movie.title = input.nextLine();
       System.out.println("Enter released date");
       movie.startDate = input.nextInt();
       System.out.println("Enter actor name ");
       movie.actor = input.nextLine();
      return movie; // 객체 반환하기.
   }

}
