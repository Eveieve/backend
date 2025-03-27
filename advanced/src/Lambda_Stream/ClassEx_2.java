package Lambda_Stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ClassEx_2 {
    Supplier<Integer> s = () -> (int) (Math.random() * 100);
    Consumer<Integer> c = i -> System.out.print(i + ",");
    Predicate<Integer> p = i -> i%2 ==0;
    Function<Integer , Integer> f = i -> i/10*10; // i의 일의 자리 없애기.


}
