package day20_0211.Collection.Ex1;
// List Collection Example.

import lombok.Getter;
import lombok.Setter;

// DTO/VO 객체. 게시판 글 하나.
@Getter
@Setter
public class Board {
    private String subject;
    private String writer;
    private String content;

    public Board(String subject, String writer, String content) {
        this.subject = subject;
        this.writer = writer;
        this.content = content;
    }



}
