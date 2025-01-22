package day11_0122.BestVOModeling;

public class MovieVO {

    // data
    private String title;
    private String released;
    private String genre;
    private String runningTime;
    private String grade;

    // constructor
    public MovieVO() {
        // default constructor
    }

    // setter 못쓰게 VO

    public MovieVO(String title,String runningTime, String grade) {
        this.title = title;
        //this.released = released;
        //this.genre = genre;
        this.runningTime = runningTime;
        this.grade = grade;

    }
    public String setGenre(String genre) {
        this.genre = genre; // does this set genre variable?
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getGenre() {
        return genre;
    }

//    public void setGenre(String genre) {
//        this.genre = genre;
//    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // 객체가 가진 전체값 출력 용도.
    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", released='" + released + '\'' +
                ", genre='" + genre + '\'' +
                ", runningTime='" + runningTime + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
