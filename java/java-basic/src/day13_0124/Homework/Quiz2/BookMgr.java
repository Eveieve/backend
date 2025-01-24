package day13_0124.Homework.Quiz2;

public class BookMgr {
    //int size;

    Book[] booklist;


    //public BookMgr() {}

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBookList() {
        for(Book book : booklist) { // Book book 이라고 타입 명시 해줘야 됨.
            System.out.println(book.getTitle());
        }
    }

    public void printTotalPrice() {
        int sum = 0; // Q.보통 초기화 안해도 되는데 왜?

        for(Book book: booklist) {
            sum += book.getPrice();
        }

        System.out.println("전체 책 가격의 합: " + sum);
    }
}
