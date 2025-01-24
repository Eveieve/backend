package day13_0124.MethodOverriding;

public class CalCircle2 extends CalCircle{

    // 컴파일 단계에서 정확히 부모의 메소드를 오버라이딩 되었는지 ㅔ크하고 문제가 있으면 컴파일 에러 출력한다.
    @Override // 어노테이션 마크 : 개발자 실수 줄여주기 위해 정확히 오버라이딩 되었는지 체크
    public double areaCircle(double radius){
        return Math.PI * radius * radius;
    }


}
