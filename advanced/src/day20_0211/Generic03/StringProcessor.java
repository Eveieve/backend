package day20_0211.Generic03;

public class StringProcessor implements Processor<String>{
    @Override
    public void process(String input) {
        System.out.println("Processing :" + input);
    }
}
