package day09_0120;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;

    static  String[][] book = new String[NUM_BOOK][NUM_ITEM]; // create book data
    static  String[][] basket = new String[NUM_BOOK][NUM_ITEM]; // create book data

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        /// ////get data redy
        book[0][0] = "ISBN1234";
        book[0][1] = "JSP programming";
        book[0][2] = "27000";
        book[0][3] = "miyoung song";
        book[0][4] = "learn JSP programming";
        book[0][5] = "IT book";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "Android programming";
        book[1][2] = "33000";
        book[1][3] = "Jaenam Woo";
        book[1][4] = "Great mentoring";
        book[1][5] = "IT book";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "Scratch";
        book[2][2] = "22000";
        book[2][3] = "GwangIl Go";
        book[2][4] = "Block coding";
        book[2][5] = "Introduction to Computers";
        book[2][6] = "2019/06/10";

        System.out.print("Enter your name : ");

        String name = input.next(); // 스페이스 기준 한 토큰 만 가져오겠다.
        System.out.print("Enter your phone number : ");
        String phone = input.next(); // 스페이스 기준 한 토큰 만 가져오겠다. 번호로 수식 계산할것아니니 스트링으로 받기.
        boolean quit = false;

        while (!quit) {
            showMenu();

            System.out.print("Choose number : ");
            int num = input.nextInt();



            switch (num) {
                case 0:
                    showBookList(book);
                    break;

                case 1:
                    menuGuestInfo(name, phone); // pass arguments
                    break;

                case 2:
                    menuCartItemList();
                    break;

                case 3:
                    menuCartClear();
                    break;

                case 4:
                    System.out.print("Enter your book's ISBN to add : ");
                    int ISBN = input.nextInt();
                    menuCartAddItem(basket, book, ISBN);
                    break;

                case 5:
                    menuCartRemoveItemCount();

                    break;

                case 6:
                    menuCartRemoveItem();
                    break;

                case 7:
                    menuCartBill();
                    break;

                case 8:
                    menuExit(true);
                    break;
            }
        }


        /// /////////////////




        String[][] basket = new String[NUM_BOOK][NUM_ITEM]; // 책 개수 만큼 크기의 장바구니 생성

    }


    public static void showMenu(){
        String welcomeMsg1 = "\t Welcome to Shopping Mall \t";
        String welcomeMsg2 = "\t Welcome to Book Market!\t ";
        String menu = """             
                    1. 고객 정보 확인하기               4. 바구니에 항목 추가하기
                    2. 장바구니 상품 목록 보기           5. 장바구니의 항목 수량 줄이기
                    3. 장바구니 비우기                  6. 장바구니의 항목 삭제하기
                    7. 영수증 표시하기                  8. 종료
                    """;
        System.out.println();
        System.out.println("*".repeat(50));
        System.out.println(welcomeMsg1);
        System.out.println(welcomeMsg2);
        System.out.println("*".repeat(50));
        System.out.println(menu);
        System.out.println("*".repeat(50));
    };


    public static void showBookList(String[][] bookList) {
        for(int i =0; i< NUM_BOOK; i++){
            for(int j =0; j < NUM_ITEM; j++){
                System.out.print(bookList[i][j] + "|");

                System.out.println(" ");
            }
        }
    }
    public static void menuGuestInfo(String name, String phone){
        System.out.println("1.고객 정보 확인하기");
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
    }

    public static void menuCartItemList(){
        System.out.println("2. 장바구니 상품 목록 보기");
    }

    public static void menuCartClear() {
        System.out.println("3. 장바구니 비우기");
    }

    public static void menuCartAddItem(String[][] basket, String[][] book, int ISBN ) { // will get 2D array 'book'
        System.out.println("4. 장바구니에 항목 추가하기");

        //ISBN = input.nextInt(); // get ISBN from user

        // if not null, add to that box
        if(basket[i] =!= null) {
            basket[i][1] = String.valueOf(ISBN); // get i as well
        }
        basket[0][1] = String.valueOf(ISBN); // add book ISBN to its place in 2d array

         //print basket
        for(int i =0; i< NUM_BOOK; i++){
            for(int j =0; j < NUM_ITEM; j++){
                System.out.print(basket[i][j] + "|");

                System.out.println(" ");
            }
        }
    }

    public static void menuCartRemoveItemCount(){
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem() {
        System.out.println("6. 장바구니 항목 삭제하기");
    }

    public static void menuCartBill() {
        System.out.println("7. 영수증 표기하기");
    }

    public static void menuExit(boolean quit) {
        System.out.println("종료");
        quit = true;
    }

//    public static void BookList(){
//
//        String[][] book = new String[NUM_BOOK][NUM_ITEM]; // create book data
//
//        book[0][0] = "ISBN1234";
//        book[0][1] = "JSP programming";
//        book[0][2] = "27000";
//        book[0][3] = "miyoung song";
//        book[0][4] = "learn JSP programming";
//        book[0][5] = "IT book";
//        book[0][6] = "2018/10/08";
//
//        book[1][0] = "ISBN1235";
//        book[1][1] = "Android programming";
//        book[1][2] = "33000";
//        book[1][3] = "Jaenam Woo";
//        book[1][4] = "Great mentoring";
//        book[1][5] = "IT book";
//        book[1][6] = "2022/01/22";
//
//        book[2][0] = "ISBN1236";
//        book[2][1] = "Scratch";
//        book[2][2] = "22000";
//        book[2][3] = "GwangIl Go";
//        book[2][4] = "Block coding";
//        book[2][5] = "Introduction to Computers";
//        book[2][6] = "2019/06/10";
//    }

    public static void addBookToBasket(String[][] bookList, String[][] basket, int ISBN){
    }
}
