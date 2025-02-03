package DS_0203.Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        IntArrQueue queue = new IntArrQueue(64);

        while(true) {
            System.out.println("current number of data : " + queue.size() + "/" + queue.capacity());
        }


    }
}
