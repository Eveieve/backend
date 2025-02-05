package DS_0205.linearSearch;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇개의 데이터를 입력하시겠습니까? ex) 7 ");
        int number = in.nextInt();
        int[] array = new int[number];   //배열의 길이 셋팅하여 배열객체 생성
        int[] array2 = new int[number + 1];   // 보초법 위한 배열.

        for(int i = 0 ; i < number ; i++){
            System.out.print("array[" +  i + "] : ");
            array[i] = in.nextInt();

        }

        System.out.print("검색할 값은? ");  //key 값을 입력
        int key = in.nextInt();
        int idx = seqSearch(array,number,key);
    }

    static int seqSearch(int[] arr, int n, int key){
        int i = 0;
        while(true){
            if(i == n) return -1;  //검색 실패 (-1을 반환)
            if(arr[i] == key) return 1;   //검색 성공 (자료가 있는 인덱스 반환)
            i++;
        }

    }

    // 보초법

    static int seqSearch2(int[] arr, int n, int key){
        int i = 0;
        arr[n] = key; // 보초.

        while(true){
            if(arr[i] == key) break;// 검색ㄱ성공
            i++;
        }
        return i == n ? -1 : i; // 찾았으면 인덱스 리턴, 아니면 -1 리턴.
    }
}
