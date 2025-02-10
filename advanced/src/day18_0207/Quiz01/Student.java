package day18_0207.Quiz01;

public class Student {
    // 외부에서 변경 못하도록 브라이빗 멤버필드 선언
    // 바로 객체 생성 못하도록 프라이빗 생성자 선언

    // 필수 필드
    private String id;
    private String name;
    private String major;

    // 선택 필드 - 참 거짓 이너 클래스에서 메소드로 설정해줄 것임.
    private String grade;
    private String phoneNumber;
    private String address;

    private Student(StuBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.phoneNumber = builder.phoneNumber; // 객체에 넣을 수 있는 필드들은 모두 바깥 클래스 생성자에 넣어두기. toString 했을때 정보볼 수 있음.
        this.grade = builder.grade; // 객체에 넣을 수 있는 필드들은 모두 바깥 클래스 생성자에 넣어두기. toString 했을때 정보볼 수 있음.
        this.address = builder.address; // 객체에 넣을 수 있는 필드들은 모두 바깥 클래스 생성자에 넣어두기. toString 했을때 정보볼 수 있음.

    }

    public static class StuBuilder {
        // 필수 필드 // 음...빌더에서 똑같이 멤버 선언하네?
        private String id;
        private String name;
        private String major;

        // 선택 필드 - 참 거짓 이너 클래스에서 메소드로 설정해줄 것임.
        //private boolean grade;
        private String grade;
        private String phoneNumber;
        private String address;

        // 메인에서(외부에서) 부를 수 있도록 퍼블릭
        public StuBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public StuBuilder addGrade(String grade) {
            this.grade = grade; // freshman으로 초기화
            return this;
        }

        public StuBuilder addPhoneNumber(String phoneNumber) {
            //this.phoneNumber = true;
            this.phoneNumber = phoneNumber;
            return this;
        }
        public StuBuilder addAddress(String address) {
            this.address = address;
            return this;
        }

        /// build!
        public Student build() {
            return new Student(this); // 바깥 클래스의 프라이빗 생성자에 빌드 타입을 받도록 파라미터를 설정하기!
            // 그리고 생성자 안 멤버 초기화는 빌더.멤버 로 초기화 할 수 있음! 받는 아규먼트 값을 (빌더.멤버)에 할당하기!
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
