create user madang@localhost identified by 'madang';
commit;

use madangdb;

desc Book; -- Book 테이블 설명해줘.

SELECT bookname, price from Book; -- select bookname column and price column from Book table

SELECT price, bookname from Book; -- 컬럼의 순서 변경 가능.

SELECT bookid, bookname, publisher, price from Book;

SELECT * from Book;

SELECT publisher from Book;

SELECT DISTINCT publisher from Book; -- 중복값을 제거하여 publisher 컬럼 검색하기

-- 범위 지정.
SELECT bookid, bookname, price from Book WHERE price < 20000; -- price 가 2만원 미만인 도서의 bookid, bookname, price 검색.
-- 사이의 범위 지정.
SELECT bookid, bookname, publisher , price from Book WHERE price BETWEEN 10000 AND 20000; -- 가격이 만원에서 이만원 사이인 책--  검색.
-- 집합 지정.
SELECT bookname, publisher from Book WHERE publisher IN ("굿스포츠", "대한미디어");
SELECT publisher from Book WHERE publisher NOT IN ("굿스포츠", "대한미디어");

SELECT bookname, publisher from Book WHERE bookname LIKE("축구의 역사"); -- 문자열에 해당하는 레코드 검색.

SELECT * FROM Book WHERE publisher = '굿스포츠' OR publisher = "대한미디어";

SELECT bookname, publisher from Book WHERE bookname LIKE("%축구%"); -- bookname에 '축구'가 포함되는 레코드 검색.

-- 도서 이름의 왼쪽 두번째 위치에 '구'라는 문자열을 각는 도서 검색하기.
SELECT bookname from Book WHERE bookname LIKE("_구%");

-- 축구에 관한 도서 중 가격이 20000원 이상인 도서 검색하기.
SELECT bookname, publisher, price from Book WHERE bookname LIKE('축구%') AND price > 20000;

-- 출판사가 '굿스포츠' 혹은 '대한미디어'인 도서를 검색하기.
SELECT bookname, publisher from Book WHERE publisher IN('굿스포츠', '대한미디어');

SELECT bookname from Book ORDER BY bookname; -- 이름순으로 - 가나다 순으로 검색하기.
SELECT bookname from Book ORDER BY bookname desc;

-- 가격의 내림차순으로 검색하기. 가격이 같다면 출판사의 오륾차순으로 검색하기. 오름차순이 기본값임.
-- ORDER BY 는 리소스를 많이 잡아먹음. 자바에서 원할때 정렬하는게 낫다.
SELECT bookname, price from Book ORDER BY price desc, publisher;

-- 고객이 주문한 도서의 총 판매액 구하기.
