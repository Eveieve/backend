package day10_0121;

import java.util.Date;

// 영화 배급사 마다 다를 MovieDTO.
public class MovieDTO {
    // 영화제목
    String title;
    // 개봉일
    //Date released;
    int startDate;

    // 주인공
    String actor;
    // 장르
    String genre;
    // 러닝타임
    String time;

    // 등급
    String grade;


    public String getTitle() {
        return title;
    }

    public String getActor() {
        return actor;
    }

    public int getStartDate() {
        return startDate;
    }

    public String getGenre() {
        return genre;
    }

    public String getTime() {
        return time;
    }

    public String getGrade() {
        return grade;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }
/// ///////////////////////////////////////////////////////
    public void printMovie (MovieDTO movie) { // MovieDTO 타입의 무비를 받을 것임.
        System.out.println(movie.title);
        System.out.println(movie.startDate);
        System.out.println(movie.title);
        System.out.println(this.time);
        System.out.println(this.grade);

    }


}
