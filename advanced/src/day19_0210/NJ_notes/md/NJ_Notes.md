# 0210 Notes
# 할일
- calendar 클래스, 데이트 클래스, 시스템 클래스 등등 배운 클래스 문서 들여다보기

1.API 도큐먼트
2. java.base 모듈
3. Object 클래스
4. 시스템 클래스
5. 문자열 클래스
6. 포장 클래스
7. 수학 클래스
8. 날자와 시간 클래스
9. 형식 클래스
10. 정규 표현식 클래스
11. 리플렉션

수업 시작전:

자바 SE 버전 —

current java SE versions - jdk 17 쓰는중..

versions in sustaining support - 문제 발생하면 유지보수 계속 해주겠다.

# API 보는 법
![img.png](img.png)

- 시그니처 - (선언부확인)
- final 인지, 
- 해당기능들 (implements......) -> 다중 기능 구현되었다라고 함. 
- 전체 상속도 확인 (java.lang.Object - java.lang.Sstring) 
- All implement Interfaces: Comparable<String> (비교해서 크다 작다 등 할 수 있는 것, 그래서 비교 연산자 사요항 필요 없음), ConstantDesc, CharSequence
- 클래스가 갖고 있는 FIELD, NESTED(되어있다면) ==> ex.) <Field Summary> Modifier and Type, Field, Description ==> 클래스가 어떤 필드를 갖고 있고 어떻게 활용있는지 알 수 있다. 
- CONSTR => Constructor Summary (많은 형태의 스트링 클래스 생성자 제공함) 
- METHOD => 클래스가 가진 메소드 나열됨 
  - All Methods,
  - Static Methods : 해당 클래스가 어떤 정적 메소드를 갖고 있는지 
  - Instance Methods : 뉴 하여 사용할 수 있는 메소드들 
  - Concrete Methods : 하나의 독립적인 단위로 바로 사용할 수 있는 메소드들 
  - Deprecated Methods: 더이상 지원하지 않는 사용하지 않는 것이 좋은 메소드들 - 이미 대체된 최신 메소드들이 있음. 

# Object Class 

중요한 메소드 3가지: 
- boolean equals(Object obj) : 객체 동등 비교 시 사용한다. 두개의 주소값을 비교하고 같으면 참, 아니면 거짓을 리턴한다. 
- int hashCode(): 객체의 해시코드(정수)를 리턴한다. HashCode method of Object class uses an object's memory address to create hash code. Therefore, each object returns different hash code. **자바에서 두 객체 비교할때는 equals() + hashCode() 같이 사용한다.** 
- String toString(): 객체 문자 정보를 리턴. 

자바문서에 가면 ..
자바는 jvm이 쓰레드 관리 한다. 개발자가 직접 스레드 관리 하지 않는다. 

- 원래 equals 는 컴퓨터 관점에서 객체 두개의 주소값이 같은지 비교한다. 하지만 스트링의 컨텐츠를 사용자 관점에서 비교하고 싶으면 @Override 하여 equals() 메소드를 재정의하여 사용할 수 있다. 

- native 는 운영체제가 가지고 있는 메소드를 의미한다. hashCode()는 jvm 의 영역이다. 개발자가 건드리는 것이 아니다. 

- clone 메소드 : 객체를 깊은 복수(deep copy) 할때 사용하는 메소드
Object.clone() 메소드는 인스턴스의 복제를 위한 메소드이다. 
해당 인스턴스 복제해서 새로운 인스턴스 생성해 그 참조값을 반환한다. 
- 

# `class record <className> (params) {}` 레코드 형태의 클래스 

# System Class 
자바의 byte code (.class)파일은 운영체제가 직접 운영하는것이 아니라 JVM 이 한다. (이건 프로그램인가?)
java.lang.System 은 운영체제의 일부 기능을 이용할 수 있다. 
static 들 - 마음대로 인스턴스해 사용할 수 없다. 

- 시스템 종료 ) System.exit(0) - 프로세스 강제로 종료하고 싶을 때. 

- 진행 시간 읽고 싶을 때: 시스템 클래스 - 1970 1/1/0시부터 현재까지 진행된 시간. 
  - System 클래스의 currentTimeMills(): 1/1000 단위로 진행된 시간 리턴. 
  - System.nanoTime(): 1/1000000000 단위로 진행된 시간 리턴. 

# String class 
# 포장객체 

# 형식 클래스 

# 정규 표현식 (Regular Expression)

문자열 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열 부분을 찾아내기 위해 사용한다.
미리 정의된 기호와 문자를 이요해서 작성된 문자열이다.
- 전화번호, 주민번호, 이메일, 비밀번호 등 중요한 데이터를 지정한 형식으로 제대로 입력했는지 검증할때 사용한다.

exampleshinsegae@gmail.com

([a-zA-Z0-9_.+-]+)@[a-zA-Z0-9_.+-] + \.[a-zA-Z0-9_.+-]

. ⇒ 임의의 문자 1개 의미.

^ ⇒ (틸드) 시작의 의미.

[^] ⇒ 일치하지 않다는 부정의 의미. 예) ^a: a로 시작하는 단어 가능. [^a]: a가 아닌 문자 1개 의미.

$ ⇒ $앞의 문자열로 문자가 끝나는가?

[ab][cd] : a,b 중 한문자와 c,d 중 한문자만 허용한다. → ac, ad, bd, bd 중 하나만 허용.

`-`  ⇒ 대쉬 사이의 문자 또는 숫자 범위의 문자 하나만 허용.

| => [a | b] a 또는 b 문자 한문자만 허용. 

() => 그루핑  01(0|1) => 010, 011 허용. 

{} => 개수 a{3}b => a가 세번 온 후 비가 와야 한다. aaab, aaaaab(3번 이상이면 됨)

\b => 공백, tab apple\b : apple 뒤에 공백이 있다. apple juice(o) apple.com(x)

\B => \b의 반대 apple.com(o) apple juice(x)

\d => 0-9 사이의 숫자. [0-9] 와 같은 의미. 

\D => \D의 반대. [^0-9] 와 같은 의미. 숫자 불가, 문자 가능. 

\s => 탭, 공백 의미. 

\w => [a-zA-Z_] 

\W => \w의 반대 

=================================================================
<정규식 수량 기호>
? => 앞의 표현식이 없거나 최대 한개만 가능.  a1? : 최대 한개마나 있거나 아예 없을 수도 있다 
a (o), a1(a), a11

* => 앞의 표현식이 없거나 있거나 (여러개) a1*: 1있을 수도 , 없을 수도 있다 

+ => 앞의 포현식이 1개 이상 or 여러개. 
+ 
