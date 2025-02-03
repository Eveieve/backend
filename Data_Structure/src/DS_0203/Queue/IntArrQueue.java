package DS_0203.Queue;

public class IntArrQueue {

    private int[] queue;
    private int capacity;
    private int num;

    public IntArrQueue(int num) {
        this.num = 0;
        this.capacity = capacity;

        try {
            queue = new int[this.capacity];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public class EmptyQueueException extends RuntimeException {
        public void EmptyIntArrQueueException(){};
    }

    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException(){}
    }


    // insert data
    public int inQueue(int x) throws Exception {
        if(this.num >= this.capacity)
            throw new OverflowQueueException(); // exception 던져주기

        queue[num++] = x;
        return x;
    }

    public int deQueue() throws EmptyQueueException { // 뽑을 게 없는데 뽑으려니 exception
    //  뽑기전에 데이터가 있는지 먼저 검사하기.
        if(num <=0) throw new EmptyQueueException();
        int x = queue[0];

        for(int i =0; i<num -1; i++) {
            queue[i] = queue[i+1]; // 한칸씩 이동
            num--; // 이후 넘을 감소.
        }
        return x;
    }

    // peek() : 맨 앞 데이터가 무엇인지 들여다보기.
    public int peek() throws EmptyQueueException {
        if(num <= 0) throw new EmptyQueueException();
        return queue[num-1];
    }

    public void clear() {
        num =0;
    }

    // key 발견하지 못하면 -1 반환.
    public int search(int key) {
        for (int i = 0; i < num; i++) {
            if (queue[i] == key) return i;
            else return -1;
        }
        return key;
    }

    public int capacity() {
        return this.capacity;
    }

    public boolean isEmpty() {
        return num <=0;
    }

    // print out all data
    public void dump() {
        if(num <=0)
            System.out.println("Queue is empty.");
        else {
            for(int data:queue) System.out.println(data);
        }
    }

    // return current size , (how many data)
    public int size() {
        return this.num;
    }

    public boolean isFull() {
        return num>=this.capacity;
    }
}
