package day20_0211.Collection.Ex2;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> myLL = new SingleLinkedList<>();
        myLL.addNode(1);
        System.out.println(myLL.head.data);
        myLL.addNode(2);
        System.out.println(myLL.head.next.data);

        myLL.addNode(3);
        System.out.println(myLL.head.next.next.data);

        myLL.addNode(4);
        System.out.println(myLL.head.next.next.data);

        System.out.println("================================");
        myLL.printAll();
    }
}
