package day20_0211.Generic.Ex3;

public class StringProcessor implements Processor<String>{
    @Override
    public void process(String input) {
        System.out.println("Processing :" + input);
    }
}
