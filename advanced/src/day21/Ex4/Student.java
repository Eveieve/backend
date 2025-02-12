package day21.Ex4;

import lombok.AllArgsConstructor;

/// /Sorting
///
@AllArgsConstructor
public class Student implements  Comparable<Student>{

    private int sno;
    private String name;




    @Override
    public int compareTo(Student o) {
//        if(this.sno > o.sno) return 1; // 왼쪽이 더 크면 양수 리턴하기
//        else if(this.sno == this.sno ) return 0;
//        else return -1;
        return this.sno - o.sno; // 차이 값을 반환한다. 양수일수도, 음수일수도 같을수도.

    }
}
