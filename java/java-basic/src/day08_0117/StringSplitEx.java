package day08_0117;

// 자바 문자열 자르는 방법 2가지
// 1. String 클래스의 split method java.lang.String
// => 매개변수 개수가 다른 2개 오버로딩 되어 있다.
// 오버로딩은 다형성 기법 중 하나. 메소드 이름이 같으면서
// 2. StringTokenizer 클래스  java.util.StringTokenizer
public class StringSplitEx {
    public static void main(String[] args) {
        String str = "input@github.com#thatzcool";
        String[] splitter = str.split("[%-@#]",3);
        // 지정해준 특수기호 기준으로 구분해준다. 인덱트0에 input, 1에 github.com,2에 thatzcool 이 들어간다. String 배열에.
        System.out.println(splitter[0]);

       // splitter = str.split("@",2); // 2개만 잘라와라

        int i = 0;

        for (String data : splitter) {
            System.out.printf("%d 위치: %s%n", ++i, data);

        }
        for(int index = 0; index < splitter.length ; index++) {
            System.out.println(splitter[index]);
        }
    }
}
