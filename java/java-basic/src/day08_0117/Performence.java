package day08_0117;


public class Performence {
    public static void main(String[] args) {
        final int lengths = 50000;

// ------------- (1) String의 +연산을 이용해서 50,000개의 *를 이어 붙인다.
        long startTime1 = System.currentTimeMillis(); // 시작시간을 기록 (millisecond단위)

        String str="";
        for(int i=0;i<lengths;i++){
            str=str+"*";
        }

        long endTime1 = System.currentTimeMillis(); // 종료시간을 기록(millisecond단위)


// ------------- (2) StringBuffer를 이용해서 50,000개의 *를 이어붙인다.
        long startTime2 = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<lengths;i++){
            sb.append("*");
        }

        long endTime2 = System.currentTimeMillis();


// ------------- (3) StringBuilder를 이용해서 50,000개의 *를 이어붙인다.
        long startTime3 = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<lengths;i++){
            sb2.append("*");
        }

        long endTime3 = System.currentTimeMillis();


// ------------- 방법(1), 방법(2), 방법(3)가 걸린 시간을 비교
        long duration1 = endTime1 - startTime1;
        long duration2 = endTime2 - startTime2;
        long duration3 = endTime3 - startTime3;

        System.out.println("String의 +연산을 이용한 경우 : "+ duration1); // 559
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2); // 10
        System.out.println("StringBuilder의 append()을 이용한 경우 : "+ duration3); // 3
    }
}