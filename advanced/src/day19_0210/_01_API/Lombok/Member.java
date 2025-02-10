package day19_0210._01_API.Lombok;

import lombok.*;

@Data // 기본 생성자, getter, setter, hashCode, equals(), toString() 자동 생성
//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor // 내가 필요로 하는 생성자를 지정한 필드만 초기화 시키는 생성자. final, NonNull 붙은 필드만 초기화
//@EqualsAndHashCode //
//@ToString

// final & @NonNull 차이점: 초기화된 final 필드는 변경할 수 없다 (setter 메소드 만들어지지 않음).
// @NonNull null이 아닌 다른값으로 setter 통해 변경할 수 있다.
public class Member {
    private String id;
    private String name;
    private int age;


}
