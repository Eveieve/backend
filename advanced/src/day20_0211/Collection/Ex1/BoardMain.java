package day20_0211.Collection.Ex1;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {

    public static void main(String[] args) {
        // 글을 보관, 운영하는 보드 리스트.
        List<Board> boardList = new ArrayList<>();

        // 보드 객체 추가
        boardList.add(new Board("title1", "ssg1", "so much stuff today"));
        boardList.add(new Board("title2", "ssg2", "so much stuff today"));
        boardList.add(new Board("title3", "ssg3", "so much stuff today"));

        // 저장된 글 목록 수 계산
        int size = boardList.size(); // 리스트인터페이스에서 공통으로 제공하는 메소드
        System.out.println("total posts: " + size);

        Board board = boardList.get(1);
        System.out.println(board.getSubject() + board.getContent() + board.getWriter());

        // 글 목록
        for(Board board1 : boardList) {

        }

        boardList.remove(1);

        // 삭제가 많이 일어난다면 LinkedList 쓰는게 좋음

    }
}
