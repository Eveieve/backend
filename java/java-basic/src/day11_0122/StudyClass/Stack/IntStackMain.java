package day11_0122.StudyClass.Stack;

import java.util.Scanner;

public class IntStackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        IntStack stack = new IntStack(input);

        while(true) {
            System.out.println();
            System.out.printf("현재 데이터 수: %d / %d\n" , stack.size(), stack.getCapacity() );
            System.out.println("1.Push 2.Pop 3.Peek 4.Dump 0.Exit");

            int menu = sc.nextInt();
            sc.nextLine();
            if(menu==0) break; // exit out of loop

            int num;
            switch(menu) {
                case 1:
                    System.out.println("Data to push: " );
                    int data = sc.nextInt();

                    // Handle exception
                    try {
                        stack.push(data) ;
                    } catch (IntStack.OverFlowIntStk e) {
                        System.out.println("Stack is full, cannot push anymore");
                    }
                    break;
            }
        }
    }
}
