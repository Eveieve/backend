package day16_0205.Ex1;

public class Main {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Tv(); // rc에 티비 할당함. ?? // 리모컨에 티비 설정.
        // 인터페이스는 자신을 구현한 구현객체 티비를 담을 수 있다. ??

        rc.turnOn();

        rc.setVolume(10);
        rc.checkVolume();
        rc.turnOff();

        rc = new Radio(); // 담는 걸 바꿀 수 있음. 인터페이스 자신을 구현한 라디오 객체이기 때문에 ***
        // 부모가 아니라도 담을 수 있다.
        // 라디오로 페어링한ㄷ.

        rc.turnOn();
        rc.setVolume(20);
        rc.checkVolume();
        rc.turnOff();

        // 이렇게 재할당하는 이유가 있음 실제상황에서?

        // 외부에서 봤을때 rc는 변하지 않았음. 하나로 티비나 라디오 모두를 킬 수 있음. 모드를 바꿔서.

        System.out.println("MAX VOLUME of RC : " + rc.MAX_VOLUME);
        System.out.println("MIN VOLUME of RC: " + rc.MIN_VOLUME); // 인터페이스에 붙어있는 스태틱 이었음.
    }
}
