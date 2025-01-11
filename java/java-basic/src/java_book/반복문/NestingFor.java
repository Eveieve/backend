package java_book.반복문;

// 6.4 문장의 중첩
public class NestingFor {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i는 " + i + ", j는 " + j);
            }
        }
        // 바깥 반복문이 1번 실행되면 안쪽 반복문은 3번 실행된다.
    }

    // <if 문 등과 조합하기>

    boolean bl = false;


}
