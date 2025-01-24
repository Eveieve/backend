package day12_0123.Singleton;

public class SingletonHolder {

    private SingletonHolder() {};

    private static class SingleInstanceHOlder {
        private static final SingletonHolder INNSTACE = new SingletonHolder();
    }
}
