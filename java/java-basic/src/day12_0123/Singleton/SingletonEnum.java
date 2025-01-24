package day12_0123.Singleton;

public enum SingletonEnum {

    INSTANCE;
    // enum 은 어차피 상수로 처리됨


}

// 싱글톤 문제점
// 1. 모듈간의 의존성 높아진다.
// 2. SOLID 원칙 다섯가지