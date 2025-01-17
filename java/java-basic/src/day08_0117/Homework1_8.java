package day08_0117;

// 1. 3
// 2. 3
// 3. 4
// 4. 2
// 5. 3

public class Homework1_8 {
    public static void main(String[] args) {

      number6();
      number7();
      number8();
    }

    public static void number6() {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        System.out.println(array.length);
        System.out.println(array[2].length);

    }

    public static void number7() {
        int[] array = {1, 5, 3, 8, 2};

        int max = array[0];
        for (int i : array) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }

    public static void number8() {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        // 전체 루핑
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                System.out.println(array[i][j]);
            }
        }
    }
}
