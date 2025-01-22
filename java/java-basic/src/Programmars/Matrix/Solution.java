package Programmars.Matrix;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {


        int[][] C = new int[arr1.length][arr2[0].length];

        for(int i =0; i<arr1.length; i++) {
            // row 가 몇개인가~ 행 하나씩 그려주기
            for(int j =0; j<arr2[0].length; j++){
                // 1행의 첫번째 element 잡고 밑으로 내려가기, 열 하나씩 그려주기 세로로 긴 동그라미 세개
                for(int k =0; k<arr2[0].length; k++)
                    C[i][j] += arr1[i][k] * arr2[k][j]; // 한 박스의 값은 내적을 더한값..
            }
        }
        // print C matrix

        return C;

    }
}