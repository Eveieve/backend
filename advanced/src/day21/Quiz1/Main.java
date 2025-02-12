package day21.Quiz1;
////CompareTo 메소드와 Collections.sort 로 정렬하기
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        class User implements Comparable<User> {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) { // 오름차순정렬됨
                return this.age - o.age; // 디스 객체 비교하는객체 o 의 나이값을 비교.
                // this.age가 더 커서 음수가 나오면 this 가 한 인덱스 당겨져서 앞으로 이동한다.
            }

//            @Override
//            public int compareTo(User o) {
//                return o.age - this.age;
//            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        /// list에 5명의 사용자 저장후 정렬
        // 정렬 리스트 출력
        List<User> users = new ArrayList<>();  // 객체를 비교하려면 인덱스가 있는 리스트에 넣는게 좋음 (어레이리스트)
        // 객 체 하나씩 생성
        User user1 = new User("John", 35);
        User user2 = new User("Crhis", 32);
        User user3 = new User("Tom", 12);
        User user4 = new User("Zendaya", 78); // 같은 객체를 비교할때 컴페러블 씀.


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        Collections.sort(users); // sort는 자동으로 compareTo 형태를 쓴다. sort 쓸때 자리바꿈이 일어난다.
        users.forEach(System.out::println); // 자동으로 toString 형태로 출력됨.
    }
}
