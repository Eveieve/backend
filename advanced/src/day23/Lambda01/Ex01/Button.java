package day23.Lambda01.Ex01;

public class Button {
    /// 클래스 안에 인터페이스?
    @FunctionalInterface
    public static interface ClickListener{
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
