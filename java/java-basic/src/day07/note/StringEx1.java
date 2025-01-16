package day07;

public class StringEx1 {

    public static void main(String[] args) {
//        String ssn = "9504221245678";
//        char gender = ssn.charAt(6);
//        System.out.println(gender);
//        switch (gender) {
//            case '1':
//            case '3':
//                System.out.println("남성");
//                break;
//            case '2':
//            case '4':
//                System.out.println("여성");
//                break;
//        }
        //2. 문자열의 길이  : 문자열에서 문자의 전체개수를 얻고 싶다면, length() 메소드를 사용한다.
//        String subject = "Java Programm ing";
//        int length = subject.length();   // subject(문자열)의 길이를 세어서 센 값을 length에 저장한다. 문자열의 내의 공백 포함
//        System.out.println(subject  + " " + length );

        //3. 문자열 대체하기 : 문자열에서 특정 문자열을 다른 문자열을 대체할때 replace()
        String oldStr = "자바 프로그래밍";
        String newStr = "혼자 공부하는 자바 프로그래밍";
        String printStr1 = oldStr.replace("자바", "JAVA");
        String printStr2 = newStr.replace("혼자 공부하는", "다 함께 공부하는");
        System.out.println(printStr1 + " " + printStr2);

        // 4. 문자열 잘라내기  : 특정 위치의 문자열을 잘라내어 가져오고 싶을때, subString() -
        // subString(int beginIndex) : 전달받은 인덱스 부터 해당 문자열의 마지막 인덱스까지 잘라내기
        // subString(int beginIdex, int endIndex) :전달받은 인덱스 부터 시작해서 endIndex까지 잘라내기
//        oldStr = "자바 프로그래밍";
//        newStr = "혼자 공부하는 자바 프로그래밍";
//        printStr2= oldStr.substring(1);
//        System.out.println(printStr2);

        //5.  문자열 찾기 : 특정 문자열의 위치를 찾고자 할때 indexOf() 메소드 사용
        // indexOf()
        //newStr = "혼자 공부하는 자바 프로그래밍";
//        int location = newStr.indexOf("울라라");
//
//        System.out.println(location);
//        String printStr4 = newStr.substring(11);
//        System.out.println(printStr4);
//
//       boolean printStr5 = newStr.contains("자바");
//       if(printStr5) {
//           System.out.println("포함");
//       }else{
//           System.out.println("불포함");
//       }
        // 6. 문자열 분리 : 문자열이 구분자(delimiter : 공백)를 기준으로 잘라낼때 split()
        String board = "1,제목,내용,작성자,파일";
        String[] tokens = board.split(",");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(tokens[2]);
        System.out.println(tokens[3]);
        System.out.println(tokens[4]);
        System.out.println();
        System.out.println("=========================");

        for(String data : tokens){   //향상된 for 또는 for-each문
            System.out.println(data);
        }
        System.out.println();
        System.out.println("=========================");
        for(int index = 0  ; index < tokens.length; index++){
            System.out.println(tokens[index]);
        }
    }
}