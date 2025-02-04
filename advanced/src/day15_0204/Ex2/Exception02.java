package day15_0204.Ex2;

public class Exception02 {

    public static void main(String[] args) {
        String[] stringArr = {"100", "1oo"};

        for(int i =0; i<stringArr.length + 1;i++) {

            try {
                int value = Integer.parseInt(stringArr[i]);
//            } catch(Exception e) {
//                e.getMessage();
//            } // 이렇게 하면 그냥 패스해버림 . 상위 레벨
                // 작은 범위를 위에 넣고 큰범위 익셉션 Exception x 를 적어주는 것은 괜찮음.
            }
            catch (ArrayIndexOutOfBoundsException e) { // 이 익셉션을 먼저 처리하려면 캐치 두개해서 먼저 넣기
                System.out.println("index out of bounds." + e.getMessage());
            }catch(NumberFormatException e) {
                // format이 맞지 않는 데이터가 들어왔을때 예외처리
                System.out.println("숫자로 변환할 수 없는 데이터 입니다. "+ e.getMessage());
            }

        }
    }

}
