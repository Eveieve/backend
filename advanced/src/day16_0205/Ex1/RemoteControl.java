package day16_0205.Ex1;

public interface RemoteControl {

    // 상수 필드 선언
    // 인터페이스이기 때문에 모든 필드가 상수처리 된다. public static final 컴파일이 자동으로 붙임.
    int MAX_VOLUME = 30; // must be initialized.
    int MIN_VOLUME = 0;


    public void turnOn(); // abstract method
    public void turnOff(); // 인터페이스에서는 abstract 없어도 바디가 없으면 추상메소드.
    public void checkVolume();
    void setVolume(int volume);
    // 인터페이스는 구현부 가진 메소드 어차피 쓸 수 없음. 아니면 디폴트 메소드는 구현부 가능.

    // 기본적인 것들 초기화 하기
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("set to mute");
            setVolume(MIN_VOLUME);
        }
    }
}
