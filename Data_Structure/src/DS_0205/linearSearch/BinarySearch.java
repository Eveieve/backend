package DS_0205.linearSearch;



import java.util.Scanner;

//이진검색
public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇개의 데이터를 입력하시겠습니까? ex) 7 ");
        int number = in.nextInt();
        int[] array = new int[number];

        System.out.print("오름차순으로 입력하세요!!");
        System.out.print("array[0] :");   //첫 요소값 입력
        array[0] = in.nextInt();

        for(int i = 1 ; i < number ; i++){
            do{
                System.out.print("array[ " + i + "] : ");
                array[i] = in.nextInt();

            }while(array[i] < array[i-1]);  //오름차순으로 배열에 입력값을 저장하겠다.
        }

        //for(int data : array) System.out.print(data + " ");

        System.out.print("검색할 값은? ");  //key 값을 입력
        int key = in.nextInt();
        int idx = binSearch(array,number,key);
        if(idx == -1 ) System.out.println("데이터가 존재하지 않습니다.");
            //else System.out.println("해당 데이터의 존재합니다. ");
        else System.out.println(" 그 값은 array[" + idx + "] 에 존재합니다.");
    }


    static int binSearch(int[] array, int number, int key){
        int pl = 0;    //검색 범위의 첫 인덱스
        int pr = number - 1;   //검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2;   //중앙 요소 인덱스
            if(array[pc] == key) return pc;  //검색 성공!
            else if(array[pc] < key) pl = pc + 1;   //검색 범위를 뒤쪽 절반으로 좁힌다.
            else pr = pc -1 ;    //검색 범위를 앞쪽 절반으로 좁힌다.
        }while(pl <=pr);
        return -1;   //검색실패


    }

}
