package day23.Lambda01.Ex01;

public class ButtonEx {
    public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener(
                () -> System.out.println("button was pressed")
        );

    }
}
