package day21.Ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/// How to use Comparator
// User DTO 클래스로 구현할건데 compareTo가 들어가있으면 부담스럽
public class ComparatorMain {
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
        User user2 = new User("Chris", 32);
        User user3 = new User("Tom", 12);
        User user4 = new User("Zendaya", 78); // 같은 객체를 비교할때 컴페러블 씀.


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        // 1.필요할때 바로 아규먼트로 던져주기
//       Collections.sort(users, new Comparator<User>() {
//           @Override
//           public int compare(User o1, User o2) {
//               return Integer.compare(o1.age, o2.age);
//           }
//       });

       // 2.다른 방식으로 작성
//        Collections.sort(users,(u1,u2) -> {
//            Integer.compare(u1.age, u2.age);
//        });

        Collections.sort(users, Comparator.comparingInt(u -> u.age));

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.name.compareTo(o1.name); // 이름 순으로 정렬하기.
            }
        });
    }
}
