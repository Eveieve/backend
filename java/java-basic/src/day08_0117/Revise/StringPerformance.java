package day08_0117.Revise;

public class StringPerformance {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("Hello");

        new Thread(()-> {
            for(int i =0; i<10000;i++){
                stringBuffer.append(1);
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


        new Thread(() -> {
            try{
                Thread.sleep(2000);

                System.out.println("StringBuffer.length:  " +stringBuffer.length()) ;
                System.out.println("StringBuilder.length: " + stringBuilder.length());

                //stringBuffer will be consistent because it is thread-safe.
                // stringBuilder might show corrupted or unexpected results due to race conditions.
            } catch(InterruptedException e){
                //throw new RuntimeException(e)
                e.printStackTrace();
            }
        }).start();
    }
}
