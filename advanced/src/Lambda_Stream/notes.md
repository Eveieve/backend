## 
1. java.lang.Runnable : void run() : 매개변수도 없고, 반환값도 없음.
2. Supplier<T> : T get() : 매개변수는 없고, 반환값만 있음
3. Consumer<T> : T void accept(T t) : Supplier와 반대. 매개변수만 있고 반환값 없음
4. Function<T,R> : R apply(T t) :  일반적인 함수. 하나의 매개변수 받아서 결과를 반환.
5. Predicate<T> : boolean test(T t) : 조건식을 표현하는데 사용됨. 매개변수는 하나, 반환 타입은 boolean.

| Predicate 쓰는 법 
```
Predicate<String> isEmptyStr = s -> s.length() == 0;
String s = "";

if(isEmptyStr.test(s))
    System.out.println("This is an empty String.");
```

---
| Q. 알맞은 함수형 인터페이스 (java.util.function 패키지)를 적으시오.

1. [ Supplier ] f = () -> (int) Math.random() *100) + 1;
: 난수를 반환함. 반환타입이 int.   
2. [ Consumer ] f = i -> System.out.print(i+ ", ");  
: 매개변수 받기만 함. 
3. [ Predicate ] f = i -> i%2 ==0;
: 조건식 - 참 거짓을 반환함. 반환값이 항상 Boolean 이기 때문에 굳이 쓰지 않음.   
4. [ Function ] f = i -> i/10*10;
: i를 넣고, i를 반환함. 입력값도 있고 반환값도 있음.   

--- 
## 매개 변수가 2개인 함수형 인터페이스
1. BiConsumer<T,U> -> void accept(T t, U u) : 두개의 매개변수만 있고, 반환값 없음. 
2. BiPredicate<T, U> -> boolean test(T t, U u) : 조건식을 표현하기 위해 사용. 매개변수는 둘이고 반환 값은 boolean. 
3. BiFunction<T, U, R> -> R apply(T t , U u) : 두개의 매개변수를 받아 하나의 결과 반환.
4. BiSupplier은 반환값이 2개여야 하기 때문에 존재하지 않음. 

### 매개 변수 3개가 필요하다면? 
@FunctionalInterface 
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

## 매개 변수 타입과 반환타입이 일치하는 함수형 인터페이스
1. UnaryOperator<T> | T apply(T t) | Function의 자손. Function과 달리 매개변수와 결과의 타입이 같다. 
2. BinaryOperator<T> | T apply(T t, T t) | BiFunction의 자손, BiFunction과 달리 결과 타입이 같다. 

```Java
@FunctionalInterface
public interface unaryOperator<T> extends Function<T,T> {
    static <T> UnaryOperator<T> identity() {
        return t -> t;
    }
}

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
```