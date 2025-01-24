package day12_0123.EnumType;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {
        Week today = null;

        // Calendar class - ses the local machine's time and timezone settings
        Calendar now = Calendar.getInstance(); // Calendar 객체 얻기
        int year = now.get(Calendar.YEAR); // field summary에서 찾기
        int month = now.get(Calendar.MONTH) + 1; // index 가 0..
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK); // 시스템으로부터 오늘 일요일(1) ~ 토요일(7) 까지의 숫자를 얻어온다.
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        // static 으로 된 필드들

        switch(week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        if(today == Week.THURSDAY) {
            System.out.println("study together");
        } else System.out.println("study alone");
    }
}
