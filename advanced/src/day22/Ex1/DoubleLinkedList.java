package day22.Ex1;

public class DoubleLinkedList<T> {
    public static void main(String[] args) {

    }

    public Node<T> head = null; // 노드객체를 참조하는 변수.
    public Node<T> tail = null; // 객체 저장할 수 있는 참조 변수.

    ///  노드 클래스
    // 제네릭 클래스, 티 타입 파라미터 사용
// Node<Integer> , Node<String> 등 다양한 타입 저장할 수 있는 노드 만들기 가능.
    public class Node<T> {
        T data; // 노드가 저장할 데이터
        Node<T> prev = null; // 이전 노드 가리키는 참조변수
        Node<T> next = null; // 다음 노드 가리키는 참조변수

        public Node(T data) { // 노드 생성시, 데이터 전달받아 필드에 저장
            this.data = data;
        }
    }

    // 노드에 대한 기능들
    public void addNode(T data) {
        if (this.head == null) {  // head 노드가 없으면
            // this.head는 연결 리스트의 첫번째 노드를 가리키는 변수.
            // 티 타입 받을 수 있는 노드 객체 생성, 노드 객체에는 data 전달 하여 헤드 노드에 할당.
            this.head = new Node<T>(data); // 새로운 노드 객체 생성. 티 타입 데이터 저장가능. 생성자 Node(T data) 호출됨.
            // 리스트에 노두가 하나밖에 없을때 헤드와 테일이 같은 노드를 가리킨다.
            this.tail = this.head;
        } else {
            // 헤드가 이미 있다면 현재 헤드 노드 가리키는 참조변수 노드 생성.
            // node 가 처음엔 head와 동일한 노드 가리키지만 루프 들면서 리스트 마지막 노드로 이동.
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next; // 현재 노드의 다음 노드로 이동
            } // 현재 노드의 다음 노드가 널일때 (없을때)
            node.next = new Node<T>(data); // 다음 노드에 새로운 노드 생성.
            node.next.prev = node; // 다음 노드의 이전 노드를 현재 노드로 설정.
            this.tail = node.next; // 새 노드 (다음노드)를 테일로 설정.
        }
    }

    public void printAll() {
        if(this.head != null) {
            // 헤드를 가리키는 참조변수 node 생성.
            Node<T> node = this.head;
            System.out.println(node.data); // print node's data
            while(node.next != null) {
                node = node.next;
            }
        }
    }
}
