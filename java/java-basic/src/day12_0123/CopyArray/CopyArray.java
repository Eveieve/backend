package day12_0123.CopyArray;

// 그림을 보고 코드 작성해보기. 머릿속에 그려보고 코드짝.
public class CopyArray {
    public static void main(String[] args) {
        // 길이 3 배열 생성 후, 초기화
        int[] oldIntArr = {1, 2, 3}; // 바로 초기화.

        // 길이 5 배열 생성 후, 길이 3배열 항목들을 옮겨야 함
        int[] newIntArr = new int[5]; // 5개 박스 용량

        newIntArr[0] = oldIntArr[0];
        newIntArr[1] = oldIntArr[1]; // Q. 그냥 assign 하는것이 copy 하는것인가?
        newIntArr[2] = oldIntArr[2]; // 변하는 부분이 뭔지 보기.
        // newIntArr[3] = oldIntArr[3]; //error.   힙에 생성되는 객체는 기본값이 자동으로 생성됨!

        for (int i = 0; i < oldIntArr.length; i++){
            newIntArr[i] = oldIntArr[i];
        }

        int[] newIntArr2 = new int[5];
        // 2. 자바 api system 클래스에서 제공하는 arraycopy()를 이용하기.
        System.arraycopy(oldIntArr, 0, newIntArr2, 0, oldIntArr.length); ///////important here

        // 잘 옮겨졌는지 배열 5 출력해보기.
        for (int i = 0; i < newIntArr.length; i++){
            System.out.print(newIntArr[i] + " ");
        }

        // Enhanced For
        for(int num : newIntArr2) { // 내부 포인터 이용 -> 속도 향상.
            System.out.print(num + " "); // no need for index.
        }
        // Code Summary: 배열을 다른 배열로 복사!! 하려면 값을 할당 (=) 하기만 하면 된다//
    }
}
