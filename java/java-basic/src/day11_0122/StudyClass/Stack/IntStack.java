package day11_0122.StudyClass.Stack;

// 직접 만들어보는 스택.
// 정수형을 저장하는 고정길이 스택 만들어보자.
// 스택은 자료를 저장할 수 있는 구조를 지칭함.
public class IntStack {
    // 자료 저장공간 :  스택용 배열
    private int[] stk;
    int capacity; // 스택의 전체용량.
    int ptr; // 스택 포인터. 포인터로 스택에 데이터 개수와 위치를 파악할 수 있다.

    public IntStack() {
    }

    public IntStack(int capacity) {
        this.ptr = 0; // 새로운 데이터를 삽입한 인덱스를 저장할 변수. ==> 스택의 인덱스 가리킴.
        this.capacity = capacity;

        try {
            stk = new int[capacity]; // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) { // exception 처리를 해야할지 어떻게 앎?
            // 생성할 수 없을때의 예외 처리.
            capacity = 0; // 0으로 하고 더이상 진행하지 말아라
            // 컴파일할때 exception 이랑, 하드웨어적 exception.
            // 스택은 이미 바닥인데, 더이상 데이터가 없는데 계속 팝을 요구당할때.
            // 스택 오버플로우/스택 언더플로우 예상해서 처리해야 됨.
        }

    }

    // 실행시 예외 : 스택이 비어있다.
    // 이너 클래스
    // 다른 클래스도 사용할 수 있게 public.
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }

    }
    //실행 시 예외 두번째 : 스택 오버 플로우(가득 찼을때)
    // 내가 정의 하는 exception class 이기 때문에 extends.
    public class OverFlowIntStk extends RuntimeException {
        public OverFlowIntStk(){}
    }

    // 데이터 넣는 기능 구현하기.
    // 내가 정의한 OverFlowIntStk
    // int 해도 되고 뭐, void 해도 되고..void 는 많지 않음.
    // 지금은 데이터가 int 이기 때문에 일단 int로.
    // throws는 위임하는 것, exception 나면 니가 처리해
    public int push(int data) throws OverFlowIntStk{
        // overflowintstk exception을 던지기
        // 이렇게 메소드에 각각 디테일하게 넣어주면 영향이 최소화됨.
        if(ptr >= capacity) throw new OverFlowIntStk();
        // data 를 넣고, ptr 을 그 후에 하나 증가시키기.
        // 제일 처음에 데이터 넣으면 ptr 은 0, 0에다가 data 넣고, ptr은 하나 증가하기.
        return stk[ptr++] = data;
    }

    // 팝은 그냥 뽑아내는거니까 파라미터 필요없음.
    public int pop() throws EmptyIntStackException{
        // pop 하면 ptr을 먼저 감소시키기.
        if(ptr <= 0) throw new EmptyIntStackException();
        return stk[--ptr];
    }

    // 피크
    // 스택의 꼭대기에 있는 데이터를 들여다 보는 메서드 : 스택이 비어있으면 예외 발생함 = 아까 만든 EMptyIntStackException.
    public int peek() throws EmptyIntStackException{
        if(ptr <= 0) throw new EmptyIntStackException();
        // 스택이 비어있지않다면 꼭대기에 있는 데이터 stk[ptr-1]를 가져올 수 있겠지.
        return stk[ptr-1]; //? ptr 0이라도 -1하나????
    }

    // clear method..
    // getcapacity()..
    public int size() {
        return ptr;
    }

    public int getCapacity() {
        return this.capacity;
    }
    // 스택안 모든 데이터를 바닥부터 꼭대기까지 순서대로 출력기능 dump
    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어 있습니다. ");
        } else {
            for(int i =0; i<ptr; i++) {
                System.out.printf("stk[%d] = " , stk[i]);
            }
        }
    }
}
