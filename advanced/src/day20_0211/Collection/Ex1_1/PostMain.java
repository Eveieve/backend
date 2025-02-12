package day20_0211.Collection.Ex1_1;

import java.util.ArrayList;
import java.util.List;

public class PostMain {
    public static void main(String[] args) {

        // 포스트를 저장하는 포스트리스트
        List<Post> postList = new ArrayList<>();

        //포스트 리스트에 포스트 객체 추가
        // 포스트 리트스는 포스트 타입을 담을 수 있는 리스트 인터페이스
        postList.add(new Post("title1", "ssg1", "content1"));
        postList.add(new Post("title2", "ssg2", "content2"));
        postList.add(new Post("title3", "ssg3", "content3"));

        // 리스트 인터페이스에서 공통으로 제공하는 메소드들 쓸 수 있다.
        int numOfPost = postList.size();

        Post post = postList.get(1);
    }
}
