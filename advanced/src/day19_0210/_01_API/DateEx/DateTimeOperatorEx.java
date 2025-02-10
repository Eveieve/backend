package day19_0210._01_API.DateEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// LocalDateTime 클래스는 시간을 조작할 수 있는 기능 제공한다.
// 자주 사용하게 될 것임 - 로컬 데이트를 받기 싫다면??
public class DateTimeOperatorEx {
    public static void main(String[] args) {

        // 1. 현재 시간 받아오기
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString()); // 2025-02-10T14:28:27.102218 .....원하는 포맷은 아님
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println(dtf);

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1 년 후의 현재시간: " + result1.format(dtf));

        // 1 month earlier
        LocalDateTime result2 = now.minusMonths(1);
        System.out.println("1 month later: " + result2.format(dtf));

        // 1 week later
        LocalDateTime result3 = now.plusMonths(1);
        System.out.println("1 week later: " + result3.format(dtf));

        // LocalDateTime target = LocalDateTime.of(year, month, dayOfMonth, hour, minute,second);....
        LocalDateTime startDateTime = LocalDateTime.of(2025, 3 , 1, 0,0,0); // 시작 날짜를 세팅 가능
        System.out.println("Start date:" + startDateTime.format(dtf));
        LocalDateTime endDateTime = LocalDateTime.of(2025, 7, 11, 0,0,0);
        System.out.println("end date: " + endDateTime.format(dtf));

        if(startDateTime.isBefore(endDateTime)) System.out.println("In progress");
        else if(startDateTime.isEqual(endDateTime)){
            System.out.println("The end!");
        }else if(startDateTime.isAfter(endDateTime)) System.out.println("Ended already.");

    }
}
