package day08_0117;

// StringBuilder vs StringBuffer perofrmance test

public class StringPerformance {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        new Thread( () -> {
            for(int i =0; i<100000; i++ ){
                stringBuffer.append(1); // 십만번 돌려서 1을 추가.
                stringBuilder.append(1);
            }
        }).start();

        new Thread( () -> { // 쓰레드 하나가 러너 한명이라고 생각.
            for(int i =0; i<100000; i++ ){
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

        new Thread( () -> {
            for(int i =0; i<100000; i++ ){
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

// 실행함수를 parameter로.
        new Thread( () -> {
            try {
                Thread.sleep(2000);

                System.out.println("StringBuffer.length: " + stringBuffer.length());
                System.out.println("StringBuilder.length: " + stringBuilder.length()); // 값이 더 적음.
                // 쓰레드들이 동시에 접근해서 몇번 십해셔 제대로 실행 안된 결과
                // 쓰레드 세이프티 하지 않다: => 쓰레드가 객체에 접근해서 변경하면 기다려주지 않음.
                // 버퍼는 쓰레드 세이프한 환경 제공함 => 멀티 쓰레드 환경에서, 한쓰레드가 어펜드 실행하고 나서, 다른 쓰레드가 어펜드하지 하지 못하게 한다. 순차적으로 실행하게 해준다.
            } catch(InterruptedException e ){
                //throw new RuntimeException(e); //Q. 이건 왜할까
                e.printStackTrace(); // error 출력
            }
        }).start();
    }
}
// 속도 생각하면 빌더, 멀티 쓰레드환경에서 안전하게 데이터 가져오려면 버퍼. (근데 버퍼해야 하는거 아닌가 그럼)
// 코테는 멀티 쓰레드 환경이 아님. 하나만 돌아가니까.
// 웹에서 데이터를 삭제 등 할꺼면 버퍼를 쓰기.
