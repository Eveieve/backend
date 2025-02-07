package day16_0205.Homework.Num2;

public class CarFactory extends Factory implements IWorkingTogether{
    public CarFactory(String name, int openHour, int closeHour) { // 3개 변수 인자로 받음.
        super(name, openHour, closeHour); // 슈퍼 생성자 호출
    } // must create constructor?????

    @Override
    public int makeProducts(char skill) {
        // skill 이 에이인 경우 3, 비인 경우 2, 씨인 경우 1 .. 스킬 값 스위치 구문

        // improved way of 'switch'!!!
        char productValue = switch (skill) {
            case 'A' -> 1;
            case 'B' -> 2;
            case 'C' -> 3;
            default -> 0;
        };
        return 0;
    }

    @Override // from IworkingTogether Interface
    public int WorkTogether(IWorkingTogether partner) {
        // ㅠㅏ트너 공장 기술력 B에 대한 하루 생산량을 리턴한다.
        ((CarFactory)partner).makeProducts('B'); // IWorkingTogether does not have makeProducts() -> so cast to CarFactory
        return 0;
    }
}
